package user;

import robot.hardware.chassis.RobotChassis;
import robot.hardware.motors.LargeMotor;
import robot.hardware.sensors.ColorSensor;
import robot.hardware.sensors.GyroSensor;
import user.runs.TestRun;

public class Startup {
	
	public static void createHardware() {
		new RobotChassis("leftWheel",'B', "rightWheel", 'C');
		new LargeMotor("arm", 'A');
		
		new ColorSensor("leftColor", 4);
		new ColorSensor("rightColor", 1);
		
		new GyroSensor("gyro", 3);
	}
	
<<<<<<< HEAD
	public static void createRuns() {
		new TestRun("test run");
=======
	public static void createRuns() { 
		//declare your run here
		new TestRun("Test Run");
>>>>>>> branch 'master' of https://github.com/BegaBlitz/BegaBot2020.git
	}
	
	public static void init() {
		//code that you want to run ONCE 
		//before the main menu starts
	}
	
}
