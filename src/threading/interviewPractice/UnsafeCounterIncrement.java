package threading.interviewPractice;


/*
        Problem 3: Shared counter increment (thread-safe)

        Implement a counter.

        Multiple threads increment it.

        Compare 3 versions:

        Version A — Unsafe
        counter++;

        Expected learning:

        Why this is not atomic.

        Breakdown:

        read
        modify
        write

        Race condition.

        Version B — synchronized

        Protect increment:

        synchronized(this) {
            counter++;
        }

        Expected learning:

        mutual exclusion
        monitor locking
        happens-before visibility
        Version C — ReentrantLock

        Protect increment:

        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }

        Expected learning:

        explicit locking
        lock discipline
        why finally matters
 */
public class UnsafeCounterIncrement implements Runnable{

    int counter ;
    public UnsafeCounterIncrement(){
        counter = 0;
    }

    public void run(){
        for(int i = 0 ; i<10000; i++) {
            counter++;
//            System.out.println(counter + " updated by " + Thread.currentThread().getName());
        }
    }
    public void printCounter(){
        System.out.println(counter);
    }


    public static void main(String args[])throws InterruptedException{

        UnsafeCounterIncrement R1 = new UnsafeCounterIncrement();

        Thread t1 = new Thread (R1);
        Thread t2 = new Thread (R1);
        Thread t3 = new Thread(R1);

        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();

        R1.printCounter();
    }



}
