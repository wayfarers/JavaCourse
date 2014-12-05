package week1.lesson2;

public class Lift {
	int currentFloor = 1;
	int totalFloorsPassed = 0;
	int totalHumansPassed = 0;
	int humansAtHome = 20; 			//��������� ���-�� ����� � ����

	public int move(int passengerOnFloor, int nextFloor, int countHuman) {
		// if (countHuman == 0) {
		// System.out.println("***��� ����� ��� ���������***");
		// return -1;
		// } else
		if (nextFloor == currentFloor) {
			System.out.println("***���� ��� �� ���� �����***");
			return -1;
		} else if ((countHuman > humansAtHome) && (passengerOnFloor != 1)) {
			System.out.println("***������: ����� ��� ��������� ������, ��� ����� � ����***");
			return -1;
		}

		if (passengerOnFloor != currentFloor)
			move(currentFloor, passengerOnFloor, 0);
		if (nextFloor == 1) // ���� �� 1� ����, ���� ������� �� ����
			humansAtHome -= countHuman;
		if (currentFloor == 1)
			humansAtHome += countHuman; // ���� � 1�� �����, ���� ������� � ���
		if (nextFloor > currentFloor)
			totalFloorsPassed += nextFloor - currentFloor; // ���� �����
		else
			totalFloorsPassed += currentFloor - nextFloor; // ���� ����

		totalHumansPassed += countHuman;
		currentFloor = nextFloor;
		return 1;
	}
	
	public int getHumansCount() {
		return humansAtHome;
	}

	public void printAboutMe() {
		System.out.println("������� ����: " + currentFloor);
		System.out.println("����� ���������� �����: " + totalHumansPassed);
		System.out.println("����� �������� ������ : " + totalFloorsPassed);
		System.out.println("����� ������ � ����: " + humansAtHome);
		if (totalFloorsPassed >= 100)
			System.out.println("��������� ����������� ������������.");
		System.out.println();
	}
}
