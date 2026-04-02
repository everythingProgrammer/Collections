package factory;

public class EmailNotification implements NotificationSender{
    public void sendNotification(){
        System.out.println("EMAIL RECIEVED");
    }
}
