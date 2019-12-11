
package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.GyroFollower;

public class TestRun extends RobotRun {

	public TestRun(String name) {
		super(name);
	}

	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		
		GyroFollower.followDegrees(0.4, 0.5, 0, 0.008, 975, true);
		RobotMap.getChassis().tankDriveDegrees(-1.0, -1.0, 110, true);
		RobotMap.getChassis().tankDriveDegrees(0.1, -0.7, 0.5, 400, true);
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5,500, true);
		RobotMap.getChassis().tankDriveDegrees(-0.7, 0.1, 0.5, 400, true);
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5, 50, false);

	}

}

