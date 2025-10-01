package exp1.creational.factory;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification factoryMethod() {
        return new SMSNotification();
    }
}