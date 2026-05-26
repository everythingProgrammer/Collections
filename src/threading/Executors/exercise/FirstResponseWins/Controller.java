package threading.Executors.exercise.FirstResponseWins;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Controller {

    public static void main(String args[]) throws ExecutionException, InterruptedException {


        List<Callable<String>> tasks = new ArrayList<>();

        tasks.add(()->{ Thread.sleep(1000); return "response from server1"; });
        tasks.add(()->{ Thread.sleep(1003); return "response from server 2";});
        tasks.add(()->{Thread.sleep(1299); return "response from server 3 ";});


        ExecutorService es = Executors.newFixedThreadPool(3);
        String result = es.invokeAny(tasks);

        System.out.println(result);
        es.shutdown();

    }

}



class FetchServer1 implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "response from server 1 ";
    }
}

class FetchServer2 implements Callable<String>{
    @Override
    public String call() throws Exception{
        return " response from server 2";
    }
}
class FetchServer3 implements Callable<String>{

    public String call()throws Exception {
        return "response from 3";
    }
}
