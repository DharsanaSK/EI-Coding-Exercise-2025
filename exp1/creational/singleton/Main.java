
package exp1.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");

        // Verify both instances are the same
        System.out.println(logger1 == logger2); // Output:true
    }
}
