package exp1.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public String notifyUser() {
        return "SMS Notification sent!";
    }
}