package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.GyroFollower;

public class Run2 extends RobotRun {

	public Run2(String name) {
		super(name);
	}

	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		
		GyroFollower.followDegreesForward(1.0, 0.8, 0, 0.1, 15000, true);
		RobotMap.getChassis().tankDriveDegrees(-1.0, -1.0, 110, true);
		RobotMap.getChassis().tankDriveDegrees(0.1, -0.7, 0.5, 400, true);
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5,580, true);
		RobotMap.getChassis().tankDriveDegrees(-0.7, 0.1, 0.5, 330, true);
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5, 25, true);

	}

}

