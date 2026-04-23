package threading.jmm;

public class FlagExample {



    boolean flag = false;
    int value = 0;
    synchronized void   writer(){

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            value = 10;
            flag = true;
            notifyAll();

    }
   synchronized void reader(){
        while(!flag){
            try {
                wait(); // releases lock
            } catch(Exception e){}
        }
        System.out.println("value = " + value);
    }


}

class Main{
    public static void main(String args[]){
        FlagExample codeRunner1 = new FlagExample();
        Thread reader = new Thread(()->{
            codeRunner1.reader();
        });
        Thread writer = new Thread(()->{
            codeRunner1.writer();
        });
        System.out.println("Starting reader");
        reader.start();
        System.out.println("Starting writer");
        writer.start();
    }
}
