package threading.interviewPractice;

public class OddEvenPrinter {


    int number =1;


    public static void main(String args[]) throws InterruptedException{

        OddEvenPrinter lock = new OddEvenPrinter();
        Thread odd = new Thread(()->{
            try {
                    synchronized (lock) {
                while (lock.number <= 10  ) {
                        while (lock.number % 2 == 0) {
                            lock.wait();
                        }
                        if(lock.number> 10){break;}
                        System.out.println( Thread.currentThread().getName()+" "+lock.number);
                        lock.number++;
                        lock.notifyAll();
//                        lock.wait(); # Don't need this , since I already have gaurd condition
                    }
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        },"odd");

        Thread even = new Thread(()->{
            try {
                    synchronized (lock) {
                while (lock.number <= 10 ) {
                        while (lock.number % 2 == 1) {
                            lock.wait();
                        }
                    if(lock.number>10){break;}
                        System.out.println( Thread.currentThread().getName()+" "+ lock.number);
                        lock.number++;
                        lock.notifyAll();
//                        lock.wait(); # Don't need this here because I already have gaurd condition , this will cause indefinate wait problem , because odd will exit but even will wait for   ever .
                    }

                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        },"even");
        odd.start();
        even.start();
        odd.join();
        even.join();
    }


}
