package threading;


/*
Create 3 threads:

One sleeps
One does heavy loop
One prints instantly

👉 Observe execution order (you’ll learn unpredictability)
 */
public class Execise4  {

    public static void main(String args[])throws InterruptedException{

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " STARTED");
            try{
                System.out.println("Thread going to sleep");
                Thread.sleep(5000);
                System.out.println("Thread waking up and finishing");
            }catch(InterruptedException e){

            }
        } , "SleepingThread");

        Thread t2 = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " STARTED");
                System.out.println("Thread counting");
                for(int i = 0 ; i<10000; i++){
                    if(i%2000 == 0)
                        System.out.println("Count reached "+i);
                }

        },"Counting Thread ");

        Thread t3 = new Thread(()->{
            System.out.println(Thread.currentThread().getName() + " STARTED");
                System.out.println("Thread is printing");

        },"Print-Thread");

        t1.start();
//        System.out.println("T1"+t1.getState());
//        System.out.println("T2"+t2.getState());
//        System.out.println("T3"+t3.getState());

        t2.start();
//        System.out.println("T1"+t1.getState());
//        System.out.println("T2"+t2.getState());
//        System.out.println("T3"+t3.getState());

        t3.start();
//        System.out.println("T1"+t1.getState());
//        System.out.println("T2"+t2.getState());
//        System.out.println("T3"+t3.getState());

    }

}
