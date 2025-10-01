package exp2.command;

import exp2.satellite.Satellite;
import exp2.utils.LoggerUtil;

public class RotateCommand implements Command {
    private final Satellite satellite;
    private final String direction;

    public RotateCommand(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }
    @Override
    public void execute() {
    if (!satellite.getOrientation().equals(direction)) {
        satellite.rotate(direction);
        LoggerUtil.log("Rotated satellite to " + direction);
    } else {
        LoggerUtil.log("Satellite already facing " + direction);
    }
}


    
}
