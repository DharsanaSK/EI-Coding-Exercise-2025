package exp1.creational.singleton;

import java.util.*;

public class Logger {
    private static Logger instance;
    private static List<String> logs;

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
   
    public void log(String message) {
        logs.add(message);
        System.out.println("[LOG]: " + message);
    }

    public List<String> getLogs() {
        return logs;
    }
}
