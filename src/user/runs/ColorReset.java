package user.runs;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import robot.RobotMap;
import robot.runs.RobotRun;
import user.utils.LineFollow;

public class ColorReset extends RobotRun{

	public ColorReset(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runInstructions() {
		// TODO Auto-generated method stub
		double white, black;
		
		
		
		LCD.drawString("Press any button to calibrate", 0, 4);
		
		LCD.drawString("L on black", 0, 0);
		
		Button.waitForAnyPress();
		
		black = RobotMap.getSensor("leftColor").read();
		
		LCD.drawString("L on white", 0, 0);
		
		Button.waitForAnyPress();
		
		white = RobotMap.getSensor("rightColor").read();
				
		LineFollow.calibrate(black, white);
		
		LCD.drawString("black: " + LineFollow.black, 0, 0);	
		LCD.drawString("white: " + LineFollow.white, 0, 1);	
		
		Button.waitForAnyPress();

	}

		
	
}
