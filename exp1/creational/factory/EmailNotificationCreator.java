package exp1.creational.factory;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification factoryMethod() {
        return new EmailNotification();
    }
}