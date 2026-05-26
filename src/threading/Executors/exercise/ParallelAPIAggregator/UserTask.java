package threading.Executors.exercise.ParallelAPIAggregator;

import java.util.concurrent.Callable;

public class UserTask implements Callable<String> {


    int userData ;

    UserTask(int userData){
        this.userData = userData;
    }

    public String call()throws InterruptedException{
        Thread.sleep(1000);
        return "UserData "+ userData;
    }
}
