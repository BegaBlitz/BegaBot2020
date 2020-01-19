package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.GyroFollower;
import user.utils.LineFollow;
import user.utils.LineFollower;

public class Run_4 extends RobotRun{

	public Run_4(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
	RobotMap.getSensor(1).resetToCurrentValue();
	
	RobotMap.getSensor("gyro").resetToCurrentValue();

	//GyroFollower.followDegreesForward(0.5, 0.5, 0, 0.02,771, false);
	LineFollow.followDegrees(0.5, 0.5, 0, 0.5, 275, true);
	//RobotMap.getChassis().tankDriveDegrees(0.5, 0.5, 0.5, 450, true);
	//Wait.waitForSeconds(0.6);
	GyroFollower.followDegreesForward(0.5, 0.5, -36, 0.02,600, true);
	//Wait.waitForSeconds(0.6);
	//RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.5, 300, true);
	//GyroFollower.followDegreesForward(-0.5, 0.5, 40, 0.02,275, true);
	GyroFollower.followDegreesBackwards(-0.5, 0.5, 36, 0.02,600, true);


	}

}
