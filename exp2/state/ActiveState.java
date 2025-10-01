package exp2.state;

import exp2.satellite.Satellite;

public class ActiveState implements PanelState {
    @Override
    public void collectData(Satellite satellite) {
        satellite.setDataCollected(satellite.getDataCollected() + 10);
        System.out.println("Data collected successfully. Total: " + satellite.getDataCollected());
    }
}
