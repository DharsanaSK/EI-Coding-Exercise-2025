package exp1.creational.singleton;

import java.util.*;

// Singleton Logger class
public class Logger {
    private static Logger instance;
    private static List<String> logs;

    // Private constructor
    private Logger() {
        logs = new ArrayList<>();
    }

    // Public method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log a message
    public void log(String message) {
        logs.add(message);
        System.out.println("[LOG]: " + message);
    }

    // Get all logged messages
    public List<String> getLogs() {
        return logs;
    }
}
