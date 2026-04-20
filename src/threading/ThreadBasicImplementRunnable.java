package threading;

public class ThreadBasicImplementRunnable implements Runnable{

    public void run(){
        System.out.println("Task executed by "+Thread.currentThread().getName());
    }



    public static void main(String args[]){
        Thread t1 = new Thread( new ThreadBasicImplementRunnable());
        t1.start();
    }
}



// States of Threads
// New - Thread  has been created but not started .
// Runnable - Ready or Running ( JVM scheduler decides )
// Blocked - Waiting for monitor lock
// Waiting - Waiting indefinitely
// Timed_Waiting - Waiting for specific time .
// Terminated - Execution finished .
