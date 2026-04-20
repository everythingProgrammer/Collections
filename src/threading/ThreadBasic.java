package threading;

public class ThreadBasic extends Thread{

    @Override
    public void run(){
        for(int i = 1; i<=5 ; i++){
            System.out.println("Running Thread :" + Thread.currentThread().getName()+" Count "+i);
        }
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


