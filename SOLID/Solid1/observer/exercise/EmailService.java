package observer.exercise;

public class EmailService implements OrderObserver{
    @Override
    public void onOrderObserve(String order) {
        try{
            System.out.println("Email Do something ");
        }catch(Exception e){
            // handle any exceptions
        }finally{
            // do something
        }

    }
}
