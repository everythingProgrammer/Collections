package sync;

public class Collision {

    private static int totalRequests = 0;

    private int instanceRequests = 0;


    private  synchronized void incrementInstanceRequest(){
        instanceRequests+=1;
    }

    private synchronized static void incrementTotalRequests(){
        totalRequests+=1;
    }
    public synchronized void mixedIncrement(){

        totalRequests++;
    }

    private void incrementInstanceRequestCodeBlockLevel(){
        synchronized( Collision.class){
            instanceRequests+=1;
        }
    }


    public static void main(String[] args) throws InterruptedException {
//        Collision obj = new Collision();
//        int numberOfThreads = 200000;
//        Thread[] threads = new Thread[numberOfThreads];
//
//        // Creating 1000 threads
//        for (int i = 0; i < 500; i++) {
//            threads[i] = new Thread(() -> {
//                obj.incrementInstanceRequest(); // Calls instance sync
//                incrementTotalRequests();       // Calls static sync
//            });
//            threads[i].start();
//        }
//        for (int i = 500; i < numberOfThreads; i++) {
//            threads[i] = new Thread(() -> {
//                obj.mixedIncrement();
//            });
//            threads[i].start();
//        }
//
//        // Wait for all threads to finish (Crucial!)
//        for (Thread t : threads) {
//            t.join();
//        }
//
//        System.out.println("Expected Instance Requests: " + numberOfThreads/2);
//        System.out.println("Actual Instance Requests: " + obj.instanceRequests);
//
//        System.out.println("Expected Total Requests: " + numberOfThreads);
//        System.out.println("Actual Total Requests: " + totalRequests);

        Collision obj = new Collision();
        int numberOfThreads = 500;
        Thread[] threads = new Thread[numberOfThreads];


        for (int i = 0; i < 500; i++) {
            threads[i] = new Thread(() -> {
                obj.incrementInstanceRequest(); // Calls instance sync
                incrementTotalRequests();       // Calls static sync
            });
            threads[i].start();
        }
        System.out.println("Expected Instance Requests: " + numberOfThreads);
        System.out.println("Actual Instance Requests: " + obj.instanceRequests);

        System.out.println("Expected Total Requests: " + numberOfThreads);
        System.out.println("Actual Total Requests: " + totalRequests);

    }



}
