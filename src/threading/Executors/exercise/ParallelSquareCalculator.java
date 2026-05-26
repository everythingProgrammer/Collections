package threading.Executors.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelSquareCalculator {


    public static void main(String args[]) throws ExecutionException, InterruptedException {
        List<Integer> nums = List.of(1,2,3,4,5);

        ExecutorService executor = Executors.newFixedThreadPool(3);


        List<Future<Integer>> results =
                new ArrayList<>();

        for(int a : nums){
//            executor.submit(()->{});

            results.add(executor.submit(new SquareTask(a)));
        }

        executor.shutdown();

        for(Future result : results){
            System.out.println(result.get());
        }
    }

}


/*


        Using Lambda
        for(int a:nums){
            Future<Integer> f = executor.submit(()->a*a);
            result.add(f)
        }
 */