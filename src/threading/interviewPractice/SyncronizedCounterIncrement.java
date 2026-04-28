package threading.interviewPractice;

public class SyncronizedCounterIncrement implements Runnable{
    private final Object lock = new Object();

    int counter ;
    public SyncronizedCounterIncrement(){
        counter = 0;
    }


    public void run(){
        for(int i  = 0; i<10000; i++) {
            synchronized (lock) {
                counter++;
//                notifyAll();
            }
        }
    }

    public void printCounter(){System.out.println(this.counter);}


    public static void main(String args[])throws InterruptedException{


        SyncronizedCounterIncrement c = new SyncronizedCounterIncrement();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread (c);
        Thread t3 = new Thread (c);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        c.printCounter();
    }
}
