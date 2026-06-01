package observer.exercise;

import java.util.ArrayList;

public class OrderService {

    ArrayList<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver orderObserver){
        observers.add(orderObserver);
    }

    public void notifyObservers(String event){
        for(OrderObserver obs : observers){
            obs.onOrderObserve(event);
        }
    }

    public void orderPlace(){
        System.out.println("ORDER PLACED");
    }
    public static void main(String args[]){
        OrderService orderService = new OrderService();
        orderService.addObserver(new InventoryService());
        orderService.addObserver(new EmailService());
        orderService.addObserver(new InvoiceService());
        orderService.orderPlace();
        orderService.notifyObservers("order");


    }


}
