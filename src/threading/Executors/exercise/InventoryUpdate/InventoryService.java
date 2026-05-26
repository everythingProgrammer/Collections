package threading.Executors.exercise.InventoryUpdate;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InventoryService {


    private   int stock = 10;


    private  final   Lock lock = new ReentrantLock();


    public   void updateInventory(int num) throws InterruptedException{

        boolean acquired = false;
        try {
            acquired = lock.tryLock();
            if (acquired) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " updating inventory"
                );

                Thread.sleep(500);

                stock += num;

                System.out.println(
                        "Stock = " + stock
                );
            } else {
                System.out.println("InventoryUnderUpdate ");
            }
        }finally{
            if(acquired)
             lock.unlock();
        }
    }


    public static void main(String args[])throws InterruptedException{
        ArrayList<Runnable> actions = new ArrayList<>();
        InventoryService inventory = new InventoryService();
        actions.add(()  ->{
            try {
               inventory. updateInventory(-1);
            } catch (InterruptedException e) {
                System.out.println("-1 failed");
                throw new RuntimeException(e);
            }
        });
        actions.add(()->{
            try {
                inventory.updateInventory( 10);
            } catch (InterruptedException e) {
                System.out.println(" 10 failed");
                throw new RuntimeException(e);
            }
        });
        actions.add(()->{
            try {
                inventory.updateInventory(-12);
            } catch (InterruptedException e) {
                System.out.println("-12 failed");
                throw new RuntimeException(e);
            }
        });
        actions.add(()->{
            try {
                inventory.updateInventory(12);
            } catch (InterruptedException e) {
                System.out.println(" 12 failed");
                throw new RuntimeException(e);
            }
        });


        ExecutorService es = Executors.newFixedThreadPool(3);

        for(int i = 0  ; i<actions.size(); i++)
           es.submit(actions.get(i));

        es.shutdown();
    }
}
