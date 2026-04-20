package threading;

public class ThreadStateDemo {

    public static void main(String args[]) throws InterruptedException{
        Thread thread = new Thread(()-> {
//            try{
//                Thread.Thread
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
        });
        System.out.println("State after creation " + thread.getState());
        thread.start();
        System.out.println("State after start(): "+thread.getState());
        Thread.sleep(100);
        System.out.println("State during sleep "+ thread.getState());
        thread.join();
        System.out.println("State after completion "+ thread.getState());

    }
}
