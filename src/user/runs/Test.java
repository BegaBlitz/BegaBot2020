package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.GyroFollower;
import user.utils.LineFollower;

public class Test extends RobotRun {

	public Test(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() 
	{
		// TODO Auto-generated method stub	}
		
	RobotMap.getChassis().tankDriveDegrees(0.7, 0.7, 0.5, 2000, true);
	GyroFollower.followDegreesForward(0.5, 0.5, 0, 0.1, 500, true);
	}
}