package threading.reentrantLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1  {


    public static void main(String args[]) throws InterruptedException {


        Lock lock = new ReentrantLock();
        /*
            lock free → acquire
            lock busy → wait
         */
        lock.lock();



        boolean acquired = lock.tryLock();
        /*
        true  → lock acquired
        false → lock unavailable
            No waiting.
            Immediate answer.
         */


        /*
        Wait up to 2 sec.

Then give up.

Best of both worlds.
         */
        Condition condition1  = lock.newCondition();

        lock.tryLock(2, TimeUnit.SECONDS);

        System.out.println("Print out ");
        lock.unlock();


    }
}
