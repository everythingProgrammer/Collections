package threading;

public class Racing {

    public static void main(String arg[]) throws InterruptedException {
        Object lock = new Object();
        int counter[] = {0};
        Thread t1 = new Thread( ()->{
            for(int i = 0 ; i<10000; i++){
                counter[0]++;
                System.out.println("counter value "+counter[0]);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0 ; i<10000 ; i++){
                synchronized( lock) {
                    counter[0]++;
                    System.out.println("counter value " + counter[0]);
                }
            }

        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter[0]);

    }
}
