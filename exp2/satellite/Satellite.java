package exp2.satellite;

import exp2.state.ActiveState;
import exp2.state.InactiveState;
import exp2.state.PanelState;

public class Satellite {
    private String orientation;
    private PanelState panelState;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.panelState = new InactiveState();
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        this.orientation = direction;
    }

    public void activatePanels() {
        this.panelState = new ActiveState();
    }

    public void deactivatePanels() {
        this.panelState = new InactiveState();
    }

    public void collectData() {
        panelState.collectData(this);
        
    }

    public String getOrientation() {
        return orientation;
    }

    public int getDataCollected() {
        return dataCollected;
    }

     public void setDataCollected(int dataCollected) {
        this.dataCollected = dataCollected;
    }

    public String getPanelStatus() {
        return (panelState instanceof ActiveState) ? "Active" : "Inactive";
    }

    @Override
    public String toString() {
        return "Orientation: " + orientation +
               "\nSolar Panels: " + getPanelStatus()+
               "\nData Collected: " + dataCollected;
    }
}
