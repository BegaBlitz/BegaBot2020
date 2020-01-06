package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.GyroFollower;

public class Run1 extends RobotRun {

	public Run1(String name) {
		super(name);
	}
	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		//
		GyroFollower.followDegreesBackwards(-0.5, 0.5, 0, 0.02,-1344, true);
		//2s
		RobotMap.getChassis().tankDriveDegrees(0.7, 0.7, 0.4, 380, true);
		Wait.waitForSeconds(1.0);

		GyroFollower.followDegreesForward(0.3, 0.3, -80, 0.02, 160, true);
		Wait.waitForSeconds(1.0);

		RobotMap.getChassis().tankDriveDegrees(0.4,0.4,0.4,540,true);
		Wait.waitForSeconds(1.0);

		GyroFollower.followDegreesForward(0.35, 0.3, 85, 0.019, 70, true);
		//6
		GyroFollower.followDegreesBackwards(-0.35, -0.35, 0, 0.02, -1440, true);
		//7
		RobotMap.getMotor("arm").rotateDegrees(-0.1, 90, true);
		//8
		Wait.waitForSeconds(1.0);
		//9
		//RobotMap.getChassis().tankDriveDegrees(-0.7, -0.7, 0.4, 350, false);
		//10
		//GyroFollower.followDegrees(0.5, 0.5, 60, 0.008, 60, true);
		//RobotMap.getChassis().tankDriveDegrees(-0.6,- 0.6, 0.5,900, true);
		//11
	}
}
