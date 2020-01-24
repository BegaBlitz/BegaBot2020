package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.Converter;
import user.utils.GyroFollower;
import user.utils.LineFollow;

public class try1 extends RobotRun{

	public try1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
	RobotMap.getSensor("gyro").resetToCurrentValue();
	GyroFollower.followDegreesForward(0.55, 0.55, 0, 0.02, Converter.cmToDegrees(48), false);
	LineFollow.followDegrees(Converter.cmToDegrees(50), "rightColor", "left", 0.3, 0.3, false);
	LineFollow.followDegrees(Converter.cmToDegrees(35), "rightColor", "left", 0.51, 0.27, false);
	LineFollow.followDegrees(Converter.cmToDegrees(20), "rightColor", "left", 0.2, 0.3, true);
	RobotMap.getChassis().tankDriveDegrees(0.4, -0.4, 0.5, 5, true);
	RobotMap.getChassis().tankDriveDegrees(-0.7, -0.7, 0.5, Converter.cmToDegrees(180), true);
	}

}
