package user.runs;

import robot.RobotMap;
import user.utils.Converter;
import user.utils.GyroFollower;

public class crane extends RobotMap {
	public crane(String name) {
		super();
	}
		public void runInstructions() {
			RobotMap.getSensor("gyro").resetToCurrentValue();
		
			GyroFollower.followDegreesForward(0.5, 0.5, 0, 0.2, Converter.cmToDegrees(70), true);
			RobotMap.getChassis().tankDriveDegrees(0.5, -0.5, 0.5, 100, true);
			RobotMap.getChassis().tankDriveDegrees(0.5, 0.5, 0.5, 400, true);
	}
}
