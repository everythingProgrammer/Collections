package factory2;

public class PaymentService {



    private final PaymentFactory factory;

    public PaymentService(PaymentFactory factory){
        this.factory = factory;
    }



    public void makePayment(PaymentType type , double amount ){
        PaymentProcessor processor = factory.getProcessor(type);
        processor.processPayment(amount);
    }
}
