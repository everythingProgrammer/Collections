package threading.Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleFuture {

    public static void main(String args[])throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(()->42);

        Integer result = future.get();

        Future<Integer> future2 = service.submit(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });
        System.out.println("BEFORE FUTURE");
        System.out.println("AFTER FUTURE "+ future2.get());
        System.out.println("AFTER GET");


    }
}
