package user;

import robot.hardware.chassis.RobotChassis;
import robot.hardware.motors.LargeMotor;
import robot.hardware.sensors.ColorSensor;
import robot.hardware.sensors.GyroSensor;
import user.runs.Run2;
import user.runs.run4;
import user.runs.run_5;
import user.runs.try1;

public class Startup {
	
	public static void createHardware() {
		new RobotChassis("leftWheel",'B', "rightWheel", 'C');
		new LargeMotor("arm", 'A');
		
		new ColorSensor("leftColor", 4);
		new ColorSensor("rightColor", 1);
		
		new GyroSensor("gyro", 3);
	}
	
	public static void ceateRuns() {
		new try1("Run 1");
		new run4("run 4");
		new Run2("build");
		new run_5("crane");
		} 

	
	public static void init() {
		//code that you want to run ONCE 
		//before the main menu starts
	}
	
}
