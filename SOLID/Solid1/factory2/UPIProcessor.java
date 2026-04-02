package factory2;

public class UPIProcessor implements PaymentProcessor{
    public void processPayment(double sum ){
        System.out.println("Paid using UPI "+sum);
    }
}
