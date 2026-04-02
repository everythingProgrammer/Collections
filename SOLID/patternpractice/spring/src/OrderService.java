public class OrderService {


    private PaymentService paymentService;

    OrderService(){
        this.paymentService = new PaymentService();
    }
    // this is dependency injection
    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void processPayment(){
        paymentService.payment();
    }

    // high cohesion

}


// To solve this there are two methods
// Service Location Pattern
// Inversion of Control

// Now in Service Locator Pattern the issue is that Order Service still instantiate paymentservice , even if its not needed right now .
