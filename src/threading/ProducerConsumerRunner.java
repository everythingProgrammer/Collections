package threading;

public class ProducerConsumerRunner {

public static void main(String args[])throws InterruptedException{


    ProducerConsumer bakery = new ProducerConsumer();

    Thread producer1  = new Thread(()->{
        for(int i  = 0 ; i<100 ; i++){
            try {
                bakery.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    },"Producer1");
    Thread producer2  = new Thread(()->{
        for(int i  = 0 ; i<100 ; i++){
            try {
                bakery.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    },"Producer2");    Thread consumer1 = new Thread(()->{
        for(int i=0;i<100;i++){
            try{
                bakery.consume();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    },"consumer");
    producer1.start();
    consumer1.start();
    producer2.start();


}

}
