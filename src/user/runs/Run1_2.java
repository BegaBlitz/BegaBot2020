package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;

public class Run1_2 extends RobotRun  {

	public Run1_2(String name) {
		super(name);
	}

	@Override
		public void runInstructions() {
			RobotMap.getSensor("gyro").resetToCurrentValue();
			//GyroFollower.followDegrees(0.5, 0.5, 0, 0.008,1345, false);


	}

}
