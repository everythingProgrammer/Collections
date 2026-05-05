package observer.exercise;

public class InvoiceService implements OrderObserver{
    @Override
    public void onOrderObserve(String order) {
        try{
            System.out.println("Do something ");
        }catch(Exception e){
            // handle any exceptions
        }finally{
            // do something
        }
    }
}
