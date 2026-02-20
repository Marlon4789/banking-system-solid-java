package mybanck.notification;

public class SmsNotification implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("Sending SMS: " + message);
    }
}
