package factory;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {

    private static final Map<NotificationType, NotificationSender> registry = new HashMap<>();

    static{
        registry.put(NotificationType.EMAIL, new EmailNotification());
        registry.put(NotificationType.ZOMATO, new ZomatoNotification());
        registry.put(NotificationType.SYSTEM, new SystemNotification());

    }

    public static NotificationSender getSender(NotificationType type){
        NotificationSender sender =  registry.get(type);

        if( sender== null){
            throw new IllegalArgumentException("No sender found");
        }
        return sender;
    }

}
