package user.runs;

import robot.runs.RobotRun;
import user.utils.GyroFollower;

public class Test extends RobotRun {

	public Test(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
		GyroFollower.followDegreesBackwards(-0.5, 1, 0, 0.008, -10000, true);
	}

}
