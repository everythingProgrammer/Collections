package adapter;

public class LegacyEmailService implements LegacyEmail{


    public void sendEmail(String subject, String body){
        System.out.println("Sending "+subject+"  body "+body);
    }
}
