package threading.interviewPractice;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCounterIncrement implements Runnable {

    private final  Lock lock = new ReentrantLock();
    int counter ;
    public ReentrantLockCounterIncrement(){
        counter=0;
    }


    public void run(){
        for(int i = 0; i<10000;i++){
            lock.lock();
            try {

                counter++;
            }finally{
                lock.unlock();
            }
        }

    }


    public static void main(String args[]) throws InterruptedException {


        ReentrantLockCounterIncrement c = new ReentrantLockCounterIncrement();



        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();


    }



}
