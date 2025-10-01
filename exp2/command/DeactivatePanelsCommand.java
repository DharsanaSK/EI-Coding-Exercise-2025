package exp2.command;


import exp2.satellite.Satellite;
import exp2.utils.LoggerUtil;

public class DeactivatePanelsCommand implements Command {
    private final Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.deactivatePanels();
        LoggerUtil.log("Solar panels deactivated");
    }
}