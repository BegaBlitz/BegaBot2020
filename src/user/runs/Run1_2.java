package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.GyroFollower;

public class Run1_2 extends RobotRun  {

	public Run1_2(String name) {
		super(name);
	}

	@Override
		public void runInstructions() {
			RobotMap.getSensor("gyro").resetToCurrentValue();
			GyroFollower.followDegreesForward(1.0, 0.99999, 90, 0.4,1520, false);


	}

}
