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

        System.out.println("Satellite Command System");
        System.out.println("Available commands: rotate <direction>, activatePanels, deactivatePanels, collectData, status, exit");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
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
        System.out.println("Exiting Satellite Command System.");
    }
}
