package threading.interviewPractice;


/*
        This was Question 4
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedProducerConsumer {


    private Queue<Integer> buffer;
    private final int capacity = 3;

    public BoundedProducerConsumer() {
        buffer = new LinkedList<>();

    }

    public synchronized void produce(int x) throws InterruptedException {

        while(buffer.size()>= capacity){
            this.wait();
        }
        buffer.add(x);
         notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while(  (buffer.isEmpty())){
            this.wait();
        }
        System.out.println("Consumer "+Thread.currentThread().getName()+" consumed "+buffer.poll());
        notifyAll();
    }


//    public static void main(String args[]) throws InterruptedException {
//
//        BoundedProducerConsumer sharedBuffer = new BoundedProducerConsumer();
//
//        Thread [] producers = new Thread[3] ;
//        Thread [] consumers = new Thread[3];
//        for(int i = 0 ; i<3; i++){
//            producers[i] = new Thread(new Producer(sharedBuffer),"Producer"+i);
//            consumers[i] = new Thread(new Consumer(sharedBuffer),"Consumer"+i);
//        }
//        for(int i = 0 ; i<3;i++){
//            producers[i].start();
//            consumers[i].start();
//        }
//
//        for(int i = 0 ; i<3; i++){
//            producers[i].join();
//            consumers[i].join();
//        }
//
//    }

}
/*
    # Uncomment Before Running



private class Producer implements Runnable{
    BoundedProducerConsumer boundedBuffer;
    Producer(BoundedProducerConsumer sharedBuffer){
        boundedBuffer= sharedBuffer;
    }
    @Override
    public void run( ) {
        for(int i  = 0 ; i<5 ; i++){
            try {
                boundedBuffer.produce(i*(int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    BoundedProducerConsumer boundedBuffer;
    public Consumer(    BoundedProducerConsumer sharedBuffer){boundedBuffer = sharedBuffer;}
    public void run () {
        for(int i = 0 ; i<5 ; i++){
            try{
                boundedBuffer.consume();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
*/
