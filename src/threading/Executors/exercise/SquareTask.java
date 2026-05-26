package threading.Executors.exercise;

import java.util.concurrent.Callable;

public class SquareTask implements Callable<Integer> {
    private final int number;

    public SquareTask(int num){
        this.number = num;
    }

    @Override
    public Integer call()throws Exception {

        return number*number;

    }
}
