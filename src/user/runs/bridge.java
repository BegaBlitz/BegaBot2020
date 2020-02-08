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
		// �� ���� ��'���� ����� �� ������ ����� ����
		GyroFollower.followDegreesForward(0.55, 0.55, 0, 0.02, Converter.cmToDegrees(120), false);
		// ������ ���� �� ��� ������� ��� 120 ��������� ������� �� 0.55 ��� ����� ���
		RobotMap.getChassis().tankDriveDegrees(0.5, -0.5, 0.5, 180, true);
		
		RobotMap.getChassis().tankDriveDegrees(0.5, 0.5, 0.5, 700, true);
		// ������ ���� �� ��� ������� ��� 700 ����� ������� �� 0.5 ��� ����� ���
		RobotMap.getChassis().tankDriveDegrees(-0.5, -0.5, 0.4, Converter.cmToDegrees(28), true);
		// ������ ���� �� ��� ������� ��� 30 ��������� ������� �� 0.5- ��� ����� ���
		RobotMap.getChassis().tankDriveDegrees(-0.5, 0.5, 0.4, 95, true);
		// ������ ���� �� ��� ������� ��� 100 ����� ������� �� 0.5 ��� ����� ���
		GyroFollower.followDegreesBackwards(-0.5, 0.5, 0, 0.1, Converter.cmToDegrees(80), true);		
		

		

		
	}

}
