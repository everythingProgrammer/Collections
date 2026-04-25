package threading.Executors.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FireAndForgetExample {

    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(2);
        Runnable task = ()->{
            System.out.println("Running in " + Thread.currentThread().getName());
        };
        service.execute(task);
        service.shutdown();

 
    }
}
