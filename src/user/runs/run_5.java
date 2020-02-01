package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.Converter;
import user.utils.GyroFollower;

public class run_5 extends RobotRun{

	public run_5(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
		RobotMap.getSensor("gyro").resetToCurrentValue();
		
		GyroFollower.followDegreesForward(0.5, 0.5, 0, 0.025, Converter.cmToDegrees(78), true);
	}

	
}

