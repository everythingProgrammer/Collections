package Multithreading;

public class ImplementsRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
