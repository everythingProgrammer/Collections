package threading.Executors.exercise.ParallelAPIAggregator;

import java.util.concurrent.Callable;

public class PaymentsTask implements Callable<String> {

    int paymentId;

    public PaymentsTask(int payments){
        this.paymentId = payments;

    }

    @Override
    public String call() throws InterruptedException {
        Thread.sleep(3000);
        return "PaymentData "+paymentId;
    }


}
