package threading.interviewPractice;

import java.util.concurrent.locks.Lock;

public class PrintingNumbers {



    /*
    1. Print numbers using 2 threads alternately

        Example:

        T1 → 1
        T2 → 2
        T1 → 3
        T2 → 4

        Concepts:

        ✔ synchronized
        ✔ wait/notify
        ✔ turn-taking

        Difficulty: Easy

        Very common.
     */



    int num =1;
    boolean flag = true;
    public static void main(String args[]) throws  InterruptedException{
        PrintingNumbers obj = new PrintingNumbers();
         Thread t1 = new Thread(  ()->{
                while ( obj.num<10  ){
            synchronized(obj) {
                    try {
                        while(!obj.flag ){
                              obj.wait();
                         }
                        System.out.println("T1 "+obj.num);
                        obj.num++;
                        obj.flag = false;
                        obj.notifyAll();
                        obj.wait();

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                obj.notifyAll();
            }
        });

        Thread t2 = new Thread(  ()->{
                // generally termination condition is kept in while and turn condition in if block
                while(obj.num<10) {
            synchronized(obj){
                    try {
                        while( obj.flag){
                             obj.wait();
                        }
                        System.out.println("T2 "+obj.num);
                        obj.num++;
                        obj.flag = true;
                        obj.notifyAll();
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                    obj.notifyAll();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
