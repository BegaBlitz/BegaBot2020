package user.utils;

public class Converter {
	public static final double cir = 62.4;
	
	public static int cmToDegrees(double cm) {
		return (int)(cm * 360 / cir * Math.PI);		
	}
	
	public static double clamp(double speed) {
		return Math.min(1, Math.max(-1, speed));
		} 
	}
			