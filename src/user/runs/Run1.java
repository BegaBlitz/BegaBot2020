package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.Converter;
import user.utils.GyroFollower;

public class Run1 extends RobotRun {

	public Run1(String name) {
		super(name);
	}
	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		
		GyroFollower.followDegreesBackwards(0.5, 0.5, 0, 0.02,Converter.cmToDegrees(77), true);
		
	}
}
