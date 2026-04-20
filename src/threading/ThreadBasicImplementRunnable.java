package threading;

public class ThreadBasicImplementRunnable implements Runnable{

    public void run(){
        for(int i = 1; i<=5 ; i++){
            System.out.println("Running Thread :" + Thread.currentThread().getName()+" Count "+i);
        }

    }



    public static void main(String args[]){
        Thread t1 = new Thread( new ThreadBasicImplementRunnable());
        t1.start();
        Thread t2 = new Thread( new ThreadBasicImplementRunnable());
        t2.start();
        Thread t3 = new Thread( new ThreadBasicImplementRunnable());
        t3.start();
    }
}



// States of Threads
// New - Thread  has been created but not started .
// Runnable - Ready or Running ( JVM scheduler decides )
// Blocked - Waiting for monitor lock
// Waiting - Waiting indefinitely
// Timed_Waiting - Waiting for specific time .
// Terminated - Execution finished .
