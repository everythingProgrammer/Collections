package factory2;

import java.util.Map;

public class  PaymentFactory {

    public   final Map<PaymentType, PaymentProcessor> registry ;


    public PaymentFactory(Map<PaymentType, PaymentProcessor> registry) {
        this.registry = registry;
    }

    public PaymentProcessor getProcessor( PaymentType type){
        PaymentProcessor processor = registry.get(type);
        if(processor==null){
            throw new IllegalArgumentException("Unsupported type ");
        }
        return processor;
    }
}
