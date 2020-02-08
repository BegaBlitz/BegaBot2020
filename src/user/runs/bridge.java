package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.Converter;
import user.utils.GyroFollower;
import user.utils.LineFollow;

public class bridge extends RobotRun{

	public bridge(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
		RobotMap.getSensor("gyro").resetToCurrentValue();
		// זה גורם לג'יירו לכוון את הרובוט בצורה ישרה
		GyroFollower.followDegreesForward(0.55, 0.55, 0, 0.02, Converter.cmToDegrees(120), false);
		// הרובוט מזיז את שני הגלגלים שלו 120 סנטימטרים במהירות של 0.55 כדי לנסוע ישר
		RobotMap.getChassis().tankDriveDegrees(0.5, -0.5, 0.5, 180, true);
		
		RobotMap.getChassis().tankDriveDegrees(0.5, 0.5, 0.5, 700, true);
		// הרובוט מזיז את שני הגלגלים שלו 700 מעלות במהירות של 0.5 כדי לנסוע ישר
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.4, Converter.cmToDegrees(28), true);
		// הרובוט מזיז את שני הגלגלים שלו 30 סנטימטרים במהירות של 0.5- כדי לנסוע ישר
		RobotMap.getChassis().tankDriveDegrees(-0.5, 0.5, 0.4, 95, true);
		// הרובוט מזיז את שני הגלגלים שלו 100 מעלות במהירות של 0.5 כדי לנסוע ישר
		GyroFollower.followDegreesBackwards(-0.5, 0.5, 0, 0.1, Converter.cmToDegrees(80), true);		
		

		

		
	}

}
