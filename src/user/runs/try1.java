package user.runs;

import robot.RobotMap;
import robot.runs.RobotRun;
import robot.utils.Wait;
import user.utils.Converter;
import user.utils.GyroFollower;
import user.utils.LineFollow;

public class try1 extends RobotRun{

	public try1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
	RobotMap.getSensor("gyro").resetToCurrentValue();
	// זה גורם לג'יירו לכוון את הרובוט בצורה ישרה
	GyroFollower.followDegreesForward(0.55, 0.55, 0, 0.02, Converter.cmToDegrees(48), false);
	// הרובוט מזיז את שני הגלגלים שלו 48 סנטימטרים במהירות של 0.55 כדי לנסוע ישר אלה הקו הקרוב
	LineFollow.followDegrees(Converter.cmToDegrees(50), "rightColor", "left", 0.3, 0.3, false);
	// הרובוט עוקב אחרי הקו כ  50 ס"מ עם הסנסור הימני על הצד השמאלי של הקו השחור
	LineFollow.followDegrees(Converter.cmToDegrees(35), "rightColor", "left", 0.51, 0.27, false);	
	// הרובוט עוקב אחרי הקו כ   35 ס"מ עם הסנסור הימני על הצד השמלי של הקו. בשורה הזו הגדלנו את מהירות הסטיה בגלל הנטייה שישי בקו	
	LineFollow.followDegrees(Converter.cmToDegrees(22.5), "rightColor", "left", 0.3, 0.3, true);
	// הרובוט עוקב אחרי הקו כ  50 ס"מ עם הסנסור הימני על הצד השמאלי של הקו השחור
	RobotMap.getChassis().tankDriveDegrees(-0.7, -0.7, 0.5, Converter.cmToDegrees(200), true);
	// הרובוט מזיז את שני הגלגלים שלו 200 סנטימטרים במהירות של 0.7- כדי לחזור אחורה לבסיס
	}

}
