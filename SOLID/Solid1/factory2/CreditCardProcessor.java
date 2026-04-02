package factory2;

public class CreditCardProcessor implements PaymentProcessor{

    public void processPayment(double sum){
        System.out.println("Paid using credit card "+sum);
    }
}
