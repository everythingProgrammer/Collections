package factory;

import static factory.NotificationType.EMAIL;

public class NotificationClient {


    public void sendNotification(NotificationType type , String message){
        NotificationSender sender = NotificationFactory.getSender(type);
        sender.sendNotification();
    }

//    public void sendNotification2(NotificationType  type, String message){
//        NotificationSender sender = NotificationFactory2.getSender(type);
//    }

    public static void main(String args[]){
        NotificationClient nc = new NotificationClient();
        nc.sendNotification(EMAIL, "");
    }
}
