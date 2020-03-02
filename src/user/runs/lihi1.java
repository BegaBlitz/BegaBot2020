package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.Converter;
import user.utils.GyroFollower;

public class lihi1 extends RobotRun {

	public lihi1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
		RobotMap.getSensor("gyro").resetToCurrentValue();
		RobotMap.getChassis().tankDriveDegrees(0.6, 0.6, 0.5, Converter.cmToDegrees(21), true);
		GyroFollower.followDegreesForward(0.5, 0.5, 0, 0.05, Converter.cmToDegrees(15), true);
	
	
	}

}
