<<<<<<< HEAD
package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.GyroFollower;

public class TestRun extends RobotRun{

	public TestRun(String name) {
		super(name);
	}

	@Override
	public void runInstructions() {
		RobotMap.getSensor("gyro").resetToCurrentValue();
		
		GyroFollower.followDegrees(0.4, 0.7, 90, 0.008, 1400, true);
	}

}
=======
package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;

public class TestRun extends RobotRun {

	public TestRun(String name) {
		super(name);
	}

	@Override
	public void runInstructions() {
//		RobotMap.getMotor("leftWheel").rotateDegrees(0.8, 0.3, 760, true);
//		RobotMap.getMotor("rightWheel").rotateDegrees(-0.8, 0.3, 760, true);
		
		RobotMap.getChassis().forwardDriveDegrees(1.0, 0.3, 850,true);
		RobotMap.getChassis().backwardDriveDegrees(1.0, 0.3, 280, true);
		RobotMap.getMotor("rightWheel").rotateDegrees(-0.7, 0.3, 300, true);
		RobotMap.getChassis().backwardDriveDegrees(1.0, 0.3, 50, true);
		RobotMap.getMotor("arm").rotateDegrees(0.4, 0.3, 300, true);
		RobotMap.getMotor("arm").rotateDegrees(0.1, 0.3, 360, true);
	}

}
>>>>>>> branch 'master' of https://github.com/BegaBlitz/BegaBot2020.git
