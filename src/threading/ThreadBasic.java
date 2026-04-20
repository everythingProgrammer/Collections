package threading;

public class ThreadBasic extends Thread{

    @Override
    public void run(){
        System.out.println("Running Thread :" + Thread.currentThread().getName());
    }

    public static void main(String [] args){
        ThreadBasic t1 = new ThreadBasic();
        ThreadBasic t2 = new ThreadBasic();
        ThreadBasic t3 = new ThreadBasic();
        ThreadBasic t4 = new ThreadBasic();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}


