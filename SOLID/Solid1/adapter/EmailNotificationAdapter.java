package adapter;

public class EmailNotificationAdapter implements Notification{


    private final LegacyEmail legacyEmailService ;

    EmailNotificationAdapter(LegacyEmail legacyEmailService){
        this.legacyEmailService = legacyEmailService;
    }


    public void send(String message){
        String subject = this.getSubject(message);
        String body = this.getBody(message);
        legacyEmailService.sendEmail(subject,body);
    }

    public String getSubject(String message){
        // Get message;
        return "Subject";
    }
    public String getBody(String message){
        return message;
    }
}
