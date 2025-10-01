package exp1.creational.factory;

public abstract class NotificationCreator {
    public abstract Notification factoryMethod();

    public String sendNotification() {
        Notification notification = factoryMethod();
        return notification.notifyUser();
    }
}