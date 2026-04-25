package threading.Executors.exercise;

import java.util.concurrent.Executor;

public class BasicRunnable {


    public static void main(String args[]){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Doing ");
            }
        };


    }
}
