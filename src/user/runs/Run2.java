package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.Converter;
import user.utils.GyroFollower;

public class Run2 extends RobotRun {

	public Run2(String name) {
		super(name);
	}

	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		
		Wait.waitForSeconds(0.3);
		//GyroFollower.followDegreesForward(p0, acceleration, target, kp, distance, brake);
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5, Converter.cmToDegrees(27), true);
		//RobotMap.getChassis().tankDriveDegrees(leftSpeed, rightSpeed, acceleration, degrees, brake);
		RobotMap.getChassis().tankDriveDegrees(-0.4, 0.4, 0.5, 120, true);
		RobotMap.getChassis().tankDriveDegrees( 0.45, 0.4,0.7, 1000, true);



	}

}

