package threading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    private final Queue<Integer> queue = new LinkedList<>();


    private final int capacity = 5;

    private final Object lock = new Object();

    public void produce(  ) throws InterruptedException{
        synchronized(lock){
            while(queue.size() == capacity){
                lock.wait();
            }
            queue.add(1);
            System.out.println("Produced by "+Thread.currentThread().getName()+ "Current Capacity "+queue.size());
            lock.notifyAll();
        }
    }
    public void consume() throws InterruptedException{
        synchronized (lock){
            while(queue.isEmpty()){
                lock.wait();
            }
            int val = queue.remove();
            System.out.println("Consumed value" +" balance "+queue.size());
            lock.notifyAll();
        }
    }


}
