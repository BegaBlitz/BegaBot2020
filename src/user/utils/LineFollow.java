package user.utils;

import robot.RobotMap;
import robot.runs.RunHandler;

public class LineFollow {

	public static double white = 0.65;
	public static double black = 0.06;
	static double target = (white + black) / 2;

	public static void calibrate(double black, double white) {
		LineFollow.white = white;
		LineFollow.black = black;
		target = (white + black) / 2;
	}
	
	public static void followDegrees(int degrees, String sensorName, String side, double kp, double p0, boolean brake) {
		RobotMap.getMotor("leftWheel").resetEncoder();
		RobotMap.getMotor("rightWheel").resetEncoder();

		double leftSpeed = p0;
		double rightSpeed = p0;
		double error;

		RobotMap.getChassis().tankDrive(p0, p0);
		
		while (RunHandler.isRunning() && RobotMap.getMotor("leftWheel").readEncoder() <= degrees
				&& RobotMap.getMotor("rightWheel").readEncoder() <= degrees) {
			
			leftSpeed = p0;
			rightSpeed = p0;
			
			error = RobotMap.getSensor(sensorName).read() - target;
	
			if (side.equalsIgnoreCase("left")) {
				leftSpeed = Converter.clamp(p0 + error * kp);
			} else if (side.equalsIgnoreCase("right")) {
				rightSpeed = Converter.clamp(p0 + error * kp);
			}
			
			RobotMap.getChassis().tankDrive(leftSpeed, rightSpeed);
		}
		
		if (brake == true) {
			RobotMap.getChassis().brake();

		} else {
			RobotMap.getChassis().coast();
		}
	}

}