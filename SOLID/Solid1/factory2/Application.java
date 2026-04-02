package factory2;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String args[]){
        Map<PaymentType , PaymentProcessor> registry = new HashMap<>();

        registry.put(PaymentType.CREDIT_CARD , new CreditCardProcessor());
        registry.put(PaymentType.UPI, new UPIProcessor());
        registry.put(PaymentType.DEBIT_CARD , new DebitCard());

        PaymentFactory factory = new PaymentFactory(registry);
        PaymentService service = new PaymentService(factory);

        service.makePayment(PaymentType.UPI, 500.0);


    }

}
