package adapter;

public class NotificationSender implements Notification {


        public void send(String message){
                System.out.println("Notification "+message);
        }

}
