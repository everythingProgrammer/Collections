package factory;

import java.util.Map;

public class NotificationFactory2 {
    private   final Map<NotificationType, NotificationSender> registry2;


    public NotificationFactory2(Map<NotificationType, NotificationSender> registry) {registry2 = registry;
    }
    public   NotificationSender getSender(NotificationType type){
        return registry2.get(type);
    }

}
