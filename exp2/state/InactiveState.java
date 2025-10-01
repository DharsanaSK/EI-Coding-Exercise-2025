package exp2.state;

import exp2.satellite.Satellite;

public class InactiveState implements PanelState {
    @Override
    public void collectData(Satellite satellite) {
        System.out.println("Cannot collect data: Panels are inactive");
    }
}
