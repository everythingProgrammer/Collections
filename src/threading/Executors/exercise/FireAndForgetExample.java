package threading.Executors.exercise;

import java.util.concurrent.*;

public class FireAndForgetExample {

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        /*
            Fire and forget Task
         */
        Runnable task = () -> {
            System.out.println("Running in " + Thread.currentThread().getName());
        };
        service.execute(task);

        ExecutorService service2 = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));


        /*
            Fire and forget task using Future


            Runnable has no return .
            submit(Runnable) = track completion
         */

        Runnable task2 = () -> {
            System.out.println("Task Running ");
        };
        Future<?> future = service.submit(task2);
//        if(future.isDone())

        System.out.println(future.get());




        /*
                Callable and Submit
                Callable = compute + return
                Future = retrieve later
         */

        Callable<Integer> task3 = () -> {
            return 10 * 10;
        };
        Future<Integer> future3 = service.submit(task3);
        Integer result = future3.get();
        System.out.println(result);

        /*
            Inline Runnable
         */
        service.submit(() -> {
            System.out.println("This is inlline runnable");
        });

        /*
        Compiler infers:

        Callable<Integer> , because return exists.
         */
        Future<Integer> future5 = service.submit(() -> {
            return 24;
        });


        Runnable taska = () -> {
            System.out.println("Task1");
        };
        Callable<Integer> taskb = () -> {
            return 50;
        };
        service.submit(taska);
        Future<Integer> results = service.submit(taskb);
        System.out.println(results.get());


        service.shutdown();

    }
}
