package exp1.creational.factory;

public class Main {
    public static void main(String[] args) {
        NotificationCreator creator = new EmailNotificationCreator();
        System.out.println(creator.sendNotification());  
        // Output: Email Notification sent!

        creator = new SMSNotificationCreator();
        System.out.println(creator.sendNotification());  
        // Output: SMS Notification sent!
    }
}