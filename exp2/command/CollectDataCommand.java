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
        if (satellite.isSolarPanelsActive()) {
            satellite.collectData();
            LoggerUtil.log("Data collected successfully. Total: " + satellite.getDataCollected());
        } else {
            LoggerUtil.log("Cannot collect data. Panels are inactive.");
        }
    }
}
