package threading.Executors.exercise.ParallelAPIAggregator;

import java.util.concurrent.Callable;

public class OrderTask implements Callable<String> {


    int userID;

    OrderTask(int userId){
        this.userID = userId;
    }


    @Override
    public String call() throws InterruptedException {
        Thread.sleep(2000);
        return "User Data: "+userID ;
    }


}
