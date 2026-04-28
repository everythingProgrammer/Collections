package threading.interviewPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Problem 5:

        Bounded Producer–Consumer using ReentrantLock + Condition

        Same business problem.

        Different concurrency primitive.

        This is where interviewers test whether you understand why Condition exists.

        Problem statement

        Implement a bounded buffer.

        Capacity:

        3

        Operations:

        produce(int item)
        consume()

        Behavior:

        Producer:

        adds item if buffer has space
        waits if full

        Consumer:

        removes item if buffer has data
        waits if empty

        Run:

        3 producer threads
        3 consumer threads

        Each:

        produce/consume 5 items
        Constraint

        Do NOT use:

        synchronized
        wait()
        notify()
        notifyAll()

        Use:

        ReentrantLock

        and:

        Condition
 */
public class ReentrantLockedProducerConsumer {


    private final Lock lock = new ReentrantLock();
    private final Condition consumerQueue = lock.newCondition();
    private final Condition producerQueue = lock.newCondition();
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 3;

    public void produce(int x) {

        try {
            lock.lock();
            while (queue.size() == 3) {
                producerQueue.await();
            }
            queue.add(x);
            consumerQueue.signalAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void consume() {
        try {
            lock.lock();
            while (queue.isEmpty()) consumerQueue.await();
            System.out.println("Consumer " + Thread.currentThread().getName() + " polled " + queue.poll());
            producerQueue.signalAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }


    public static void main(String args[]) throws InterruptedException{
        ReentrantLockedProducerConsumer sharedBuffer = new ReentrantLockedProducerConsumer();

        Thread[] producers = new Thread[3];
        Thread[] consumers = new Thread[3];
        for (int i = 0; i < 3; i++) {
            producers[i] = new Thread(new Producer(sharedBuffer), "Producer" + i);
            consumers[i] = new Thread(new Consumer(sharedBuffer), "Consumer" + i);
        }
        for (int i = 0; i < 3; i++) {
            producers[i].start();
            consumers[i].start();
        }

        for (int i = 0; i < 3; i++) {
            producers[i].join();
            consumers[i].join();
        }

    }

}

class Producer implements Runnable {

    private final ReentrantLockedProducerConsumer sharedBuffer;

    Producer(ReentrantLockedProducerConsumer buffer) {
        sharedBuffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedBuffer.produce((int)(Math.random() * 100) );
        }
    }
}


class Consumer implements Runnable {
    private final ReentrantLockedProducerConsumer sharedBuffer;

    Consumer(ReentrantLockedProducerConsumer buffer) {
        sharedBuffer = buffer;
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedBuffer.consume();
        }
    }
}

/*
4th improvement — final fields

Your current:

private ReentrantLockedProducerConsumer sharedBuffer;

Works.

But:

sharedBuffer

is mutable.

Meaning:

this is allowed:

sharedBuffer = anotherBuffer;

later.

That’s dangerous.

With:

private final ReentrantLockedProducerConsumer sharedBuffer;

Java guarantees:

assigned once
never reassigned

Immutable reference.

Important distinction:

final reference ≠ immutable object

This:

final Queue<Integer> queue

means:

queue reference fixed.

But contents can change:

queue.add(...)
queue.poll(...)

Still allowed.

Only reassignment forbidden:

queue = new LinkedList<>();

forbidden.

Why does this matter in concurrency?

Because mutable references create visibility and consistency risks.

Imagine:

Producer:

sharedBuffer.produce()

Consumer:

sharedBuffer.consume()

If someone reassigns:

sharedBuffer = newBuffer;

Now producer and consumer may operate on different buffers.

That breaks synchronization model.

Catastrophic.

final protects object graph stability.

Especially important for shared resources.

Extra JVM benefit:

Final fields have stronger initialization guarantees under Java Memory Model.

Once constructor finishes:

other threads safely see initialized final fields

This is one reason immutable objects are naturally thread-safe.

Relevant in advanced interviews.

Summary:

Interrupt improvement:

preserves cancellation intent

Final field improvement:

preserves reference stability

Neither changes “correctness” of your toy program.

Both improve production safety.

That distinction matters in interviews:

working code vs production-grade code.
 */