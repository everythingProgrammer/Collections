package sync;

import java.util.ArrayList;
import java.util.List;

public class Collision {

    private static int totalRequests = 0;

    private int instanceRequests = 0;


    private  synchronized void incrementInstanceRequest(){
        instanceRequests+=1;
    }
    private  synchronized void incrementInstanceRequest2(){
        instanceRequests+=1;
    }
    private  synchronized void incrementInstanceRequest3(){
        instanceRequests+=1;
    }

    private synchronized static void incrementTotalRequests(){
        totalRequests+=1;
    }
    public  void mixedIncrement(){
        instanceRequests ++;
        totalRequests++;
    }

    private void incrementInstanceRequestCodeBlockLevel(){
        synchronized( Collision.class){
            instanceRequests+=1;
        }
    }


    public static void main(String[] args) throws InterruptedException {


        Collision obj = new Collision();
        int numberOfThreads = 4;
        Thread[] threads = new Thread[numberOfThreads];


        for (int i = 0; i < 4; i++) {
            threads[i] = new Thread(() -> {
//                obj.incrementInstanceRequest(); // Calls instance sync
//                incrementTotalRequests();       // Calls static sync
                obj.mixedIncrement();
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }
        System.out.println("Expected Instance Requests: " + numberOfThreads);
        System.out.println("Actual Instance Requests: " + obj.instanceRequests);

        System.out.println("Expected Total Requests: " + numberOfThreads);
        System.out.println("Actual Total Requests: " + totalRequests);
        Integer i = 10;
        Integer j = 10;
        System.out.println(i);
        ArrayList<Integer> ar = new ArrayList<>(List.of(1,2,3,4));
        Integer a = ar.get(0);
        System.out.println(a);

    }



}
