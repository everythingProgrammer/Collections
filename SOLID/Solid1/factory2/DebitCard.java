package factory2;

public class DebitCard implements PaymentProcessor{
    public void processPayment(double sum){
        System.out.println("Paid using Debit Card "+sum);
    }
}
