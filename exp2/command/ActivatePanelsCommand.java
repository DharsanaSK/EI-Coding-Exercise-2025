package exp2.command;

import exp2.satellite.Satellite;
import exp2.utils.LoggerUtil;

public class ActivatePanelsCommand implements Command {
    private final Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.activatePanels();
        LoggerUtil.log("Satellite panels activated");
    }
}
