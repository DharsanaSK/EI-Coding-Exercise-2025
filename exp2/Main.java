package exp2;

import exp2.exceptions.*;
import exp2.invoker.CommandInvoker;
import exp2.satellite.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        CommandInvoker invoker = new CommandInvoker(satellite);
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------SATELLITE COMMAND SYSTEM-------------");
        System.out.println("Available commands: rotate <direction>, activatePanels, deactivatePanels, collectData, status, exit");

        boolean running=true;
        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                running=false;
                break;
            }

            try {
                String result = invoker.executeCommand(input);
                System.out.println(result);
            } catch (InvalidCommandException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("-------EXITING SATELLITE COMMAND SYSTEM----------");
    }
}
