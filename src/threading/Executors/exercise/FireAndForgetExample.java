package threading.Executors.exercise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FireAndForgetExample {

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        /*
            Fire and forget Task
         */
        Runnable task = ()->{
            System.out.println("Running in " + Thread.currentThread().getName());
        };
        service.execute(task);



        /*
            Fire and forget task using Future


            Runnable has no return . 
         */

        Runnable task2 = ()->{
            System.out.println("Task Running ");
        };
        Future<?> future = service.submit(task2);
//        if(future.isDone())

        System.out.println(future.get());
        service.shutdown();

    }
}
