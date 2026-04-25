package threading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FirstRun {
    public static void main(String args[]) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        Future<String> future = pool.submit(()-> fetchFromDB());

        pool.shutdown();
        pool.awaitTermination(20, TimeUnit.SECONDS);
    }
    public static String fetchFromDB(){

        System.out.println("FETCHING FROM DB SYSOUT");
        return "DONE";
    }
}
