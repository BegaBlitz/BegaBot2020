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
		GyroFollower.followDegrees(0.5, 0.5, 0, 0.008,1345, false);
		
		//1
		RobotMap.getChassis().tankDriveDegrees(-0.7, -0.7, 0.4, 205, true);
		//2
		GyroFollower.followDegrees(0.15, 0.3, -70, 0.008, 35, true);
		//3
		RobotMap.getChassis().tankDriveDegrees(-0.4,-0.4,0.4,466,true);
		//4
		GyroFollower.followDegrees(0.15, 0.3, 52, 0.008, 50, true);
		//5
		GyroFollower.followDegrees(0.35, 0.35, 0, 0.008, 420, true);
		//6
		RobotMap.getChassis().tankDriveDegrees(0.01, 0.01, 0.4, 207, true);
		//7
		//Wait.waitForSeconds(1.0);
		//8
		//RobotMap.getChassis().tankDriveDegrees(-0.7, -0.7, 0.4, 350, false);
		//9
		//GyroFollower.followDegrees(0.5, 0.5, 60, 0.008, 60, true);
		//RobotMap.getChassis().tankDriveDegrees(-0.6,- 0.6, 0.5,900, true);
		//10
	}
}
