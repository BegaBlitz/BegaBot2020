package user.utils;

import robot.RobotMap;
import robot.runs.RunHandler;

public class GyroFollower {
	
	public static void followDegrees(double p0, double ecceleration, int target, double kp, int distance, boolean brake){ {
		
		RobotMap.getMotor("leftWheel").resetEncoder();
		RobotMap.getMotor("rightWheel").resetEncoder();
		
		RobotMap.getChassis().drive(p0);
		
		while(RunHandler.isRunning() && RobotMap.getMotor("leftWheel").readEncoder() <= distance
				&& RobotMap.getMotor("rightWheel").readEncoder() <= distance) {

			int error = (int) (RobotMap.getSensor("gyro").read() - target);
			System.out.println(RobotMap.getSensor("gyro").read());
			RobotMap.getChassis().tankDrive(p0, Math.min(p0 + (error * kp), 1.0));
		}
		
		if(brake) {
			RobotMap.getChassis().brake();
		} else {
			RobotMap.getChassis().coast();
		}
			
		
	}
		
	}
	
}
