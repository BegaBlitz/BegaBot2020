package user.runs;

import robot.runs.RobotRun;
import robot.runs.RunHandler;

public class LightSensorCheck extends RobotRun{

	public LightSensorCheck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		while (RunHandler.isRunning()) {
			System.out.println("להחליף את זה במה שהחיישן אור השמאלי רואה");
		}
		
	}

}
