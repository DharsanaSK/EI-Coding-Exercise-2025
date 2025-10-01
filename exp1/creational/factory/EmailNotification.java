package exp1.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public String notifyUser() {
        return "Email Notification sent!";
    }
}