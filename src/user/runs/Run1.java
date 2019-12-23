package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.GyroFollower;

public class Run1 extends RobotRun {

	public Run1(String name) {
		super(name);
	}
	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		//
		GyroFollower.followDegreesBackwards(-0.5, 0.5, 0, 0.008,-1340, true);
		//2
		RobotMap.getChassis().tankDriveDegrees(0.7, 0.7, 0.4, 380, true);
		//3
		//GyroFollower.followDegreesBackwards(-0.15, 0.3, -45, 0.008, , true);
		//4
		//RobotMap.getChassis().tankDriveDegrees(-0.4,-0.4,0.4,540,true);
		//5
		//GyroFollower.followDegrees(0.15, 0.3, 52, 0.008, 45, true);
		//6
		//GyroFollower.followDegrees(0.35, 0.35, 0, 0.008, -440, true);
		//7
		//RobotMap.getMotor("arm").rotateDegrees(0.6, 90, true);
		//8
		//Wait.waitForSeconds(1.0);
		//9
		//RobotMap.getChassis().tankDriveDegrees(-0.7, -0.7, 0.4, 350, false);
		//10
		//GyroFollower.followDegrees(0.5, 0.5, 60, 0.008, 60, true);
		//RobotMap.getChassis().tankDriveDegrees(-0.6,- 0.6, 0.5,900, true);
		//11
	}
}
