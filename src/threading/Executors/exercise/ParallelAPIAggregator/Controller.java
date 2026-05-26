package threading.Executors.exercise.ParallelAPIAggregator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Controller {

    public static void main(String args[]) throws ExecutionException, InterruptedException {

        List<Integer> ids = List.of(1,2,3,4,5,6,7,8);

        ExecutorService es = Executors.newFixedThreadPool(3);

        List<Future<String>> tasks = new ArrayList<>();

        for(Integer id : ids){
            tasks.add(es.submit(new OrderTask(id)));
            tasks.add(es.submit(new PaymentsTask(id)));
            tasks.add(es.submit(new UserTask(id)));
        }

        for(Future<String> result:tasks){
            System.out.println(result.get());
        }



        /*
            Here we come across  CompletionService
         */
        CompletionService<String> cs = new ExecutorCompletionService<>(es);
        cs.submit(new UserTask(5));
        cs.submit(new PaymentsTask(5));
        cs.submit(new OrderTask(5));


        // now collect
        for(int i=0;i<24;i++){

            Future<String> completed =
                    cs.take();

            System.out.println(
                    completed.get()
            );
        }


        es.shutdown();

    }
}
