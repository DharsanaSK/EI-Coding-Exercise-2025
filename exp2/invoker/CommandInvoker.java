package exp2.invoker;

import exp2.command.*;
import exp2.exceptions.InvalidCommandException;
import exp2.satellite.Satellite;
import exp2.utils.LoggerUtil;
import java.util.Arrays;
import java.util.List;

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
                String inputDirection = parts[1].trim();
                // input validation
                String formattedDirection = inputDirection.substring(0,1).toUpperCase() 
                                    + inputDirection.substring(1).toLowerCase();

                List<String> validDirections = Arrays.asList("North", "South", "East", "West");

                if (!validDirections.contains(formattedDirection)) {
                    LoggerUtil.log("Invalid rotation direction: " + inputDirection);
                    command = null; }
                else {
                    command = new RotateCommand(satellite, formattedDirection);
                }
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

        // Execute
        try {
            command.execute();
        } catch (Exception e) {
            throw new InvalidCommandException("Error in executing command. ");
        }

        return "Executed command: " + cmd + (parts.length > 1 ? " " + parts[1] : "");
    }
}
