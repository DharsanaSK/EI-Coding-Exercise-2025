package exp2.invoker;

import exp2.command.*;
import exp2.exceptions.InvalidCommandException;
import exp2.satellite.Satellite;

public class CommandInvoker {
   
    private final Satellite satellite;

    public CommandInvoker(Satellite satellite) {
        this.satellite = satellite;
    }
    public String executeCommand(String input) throws InvalidCommandException {
        String[] parts = input.trim().split("\\s+");
        if (parts.length == 0) {
            throw new InvalidCommandException("Empty command");
        }

        String cmd = parts[0].toLowerCase();
        Command command;

        switch (cmd) {
            case "rotate":
                if (parts.length < 2) throw new InvalidCommandException("Rotate command requires a direction");
                String direction = parts[1];
                command = new RotateCommand(satellite, direction);
                break;

            case "activatepanels":
                command = new ActivatePanelsCommand(satellite);
                break;

            case "deactivatepanels":
                command = new DeactivatePanelsCommand(satellite);
                break;

            case "collectdata":
                command = new CollectDataCommand(satellite);
                break;
            
            case "status":
                return satellite.toString();


            default:
                throw new InvalidCommandException("Unknown command: " + cmd);
        }

        // Execute immediately
        try {
            command.execute();
        } catch (Exception e) {
            throw new InvalidCommandException("Error executing command: " + e.getMessage());
        }

        return "Executed command: " + cmd + (parts.length > 1 ? " " + parts[1] : "");
    }
}
