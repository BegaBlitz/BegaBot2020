package user;

import robot.hardware.chassis.RobotChassis;
import robot.hardware.motors.LargeMotor;
import robot.hardware.sensors.ColorSensor;
import robot.hardware.sensors.GyroSensor;

public class Startup {
	
	public static void createHardware() {
		new RobotChassis("leftWheel",'B', "rightWheel", 'C');
		new LargeMotor("arm", 'A');
		
		new ColorSensor("leftColor", 4);
		new ColorSensor("rightColor", 1);
		
		new GyroSensor("gyro", 3);
	}
	
	public static void createRuns() {
		//declare your run here
	}
	
	public static void init() {
		//code that you want to run ONCE 
		//before the main menu starts
	}
	
}
