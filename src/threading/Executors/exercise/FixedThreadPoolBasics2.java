package threading.Executors.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolBasics2 {


    public static void main(String args[]){
        ExecutorService es = Executors.newFixedThreadPool(3);

        for(int i = 0 ; i<=10;i++){
            int TaskId = i;

            es.submit(()->{
                System.out.println("Task "+TaskId + " running on " + Thread.currentThread().getName());

                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            });

        }
        es.shutdown();


    }
}
