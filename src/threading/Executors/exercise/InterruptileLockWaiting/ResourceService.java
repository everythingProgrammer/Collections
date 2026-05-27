package threading.Executors.exercise.InterruptileLockWaiting;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceService {


    private final Lock lock = new ReentrantLock();


    public void process() throws InterruptedException {

        lock.lockInterruptibly();

        try{
            System.out.println(Thread.currentThread().getName()+" acquired lock");
            Thread.sleep(5000);
        }finally{
            lock.unlock();
        }
    }

    public static void main(String args[]) throws InterruptedException{
        ResourceService service = new ResourceService();
        Thread t1 = new Thread(()->{

            try{
                service.process();
            }catch( InterruptedException e){
                System.out.println(Thread.currentThread().getName()+ " interrupted");
                Thread.currentThread().interrupt();
            }

        }, "Thread-1 ");


        Thread t2 = new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName() + " waiting for lock");
                service.process();

            }
        catch (InterruptedException e) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " interrupted while waiting"
            );

            Thread.currentThread()
                    .interrupt();
        }

        },"Thread-2");
        t1.start();

        Thread.sleep(100);

        t2.start();

        Thread.sleep(1000);

        t2.interrupt();
    }
}
