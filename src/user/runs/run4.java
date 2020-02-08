package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.Converter;
import user.utils.GyroFollower;
import user.utils.LineFollow;

public class run4 extends RobotRun{

	public run4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {

	
	RobotMap.getSensor("gyro").resetToCurrentValue();
	
	
	GyroFollower.followDegreesForward(0.55, 0.55, 0, 0.02, Converter.cmToDegrees(48), false);
	LineFollow.followDegrees(Converter.cmToDegrees(20), "rightColor", "left", 0.3, 0.3, true);
	RobotMap.getChassis().tankDriveDegrees(-0.35, 0.35, 0.4, 75, true);
	Wait.waitForSeconds(0.3);
	RobotMap.getChassis().tankDriveDegrees(0.5, 0.5, 0.5, Converter.cmToDegrees(12), true);
	Wait.waitForSeconds(0.3);
	RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5, Converter.cmToDegrees(23) , true);
	RobotMap.getChassis().tankDriveDegrees(0.4, -0.4, 0.5, 75, true);
	Wait.waitForSeconds(0.3);
	GyroFollower.followDegreesForward(-0.6, 0.6, 0, 0.02,Converter.cmToDegrees(115), true);
	//GyroFollower.followDegreesBackwards(-0.5, 0.5, 36, 0.02,600, true);


	}

}
