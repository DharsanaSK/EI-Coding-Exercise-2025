package exp2.command;

import exp2.satellite.Satellite;
import exp2.utils.LoggerUtil;

public class CollectDataCommand implements Command {
    private final Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

     @Override
    public void execute() {
        satellite.collectData(); // state decides behavior
        LoggerUtil.log("Data collection attempted.");
    }
}
