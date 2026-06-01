package observer.exercise;

public class InventoryService implements OrderObserver{
    @Override
    public void onOrderObserve(String order) {
        try{
            System.out.println(" Inventory Do something ");
        }catch(Exception e){
            // handle any exceptions
        }finally{
            // do something
        }
    }
}
