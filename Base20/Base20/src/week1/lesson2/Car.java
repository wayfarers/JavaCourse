package week1.lesson2;

public class Car {
	String number;
	String color;
	int status = 0;			//0 - �� ��������, 1 - ��������, 3 - ��������
	
	int countHuman = 0;
	public void addHuman(int p) {
		countHuman += p;
	}
	public void printAboutMe() {
		System.out.println("� ���� � ������� " + number + ". " + "��� ���� " + color);
	}
	
	public void start() {
		if(status == 0) {
			status = 1;
			System.out.println("���� � ������� " + number + " ��������.");
		}
		else
			System.out.println("���� � ������� " + number + " �� ����� ���������, �.�. ��� ��������.");
	}
	
	public void move() {
		if (status == 1) {
			status = 3;
			System.out.println("���� � ������� " + number + " �������.");
		}
		else if (status == 3)
			System.out.println("���� � ������� " + number + " �� ����� �������, �.�. ��� ����.");
		else
			System.out.println("���� � ������� " + number + " �� ����� �������, �.�. ��������� ����������.");
	}
	
	public void stop() {
		if (status == 3) {
			status = 0;
			System.out.println("���� � ������� " + number + " ������������.");
		} else
			System.out.println("���� � ������� " + number + " �� ����� �����������, �.�. �� ����.");
	}
}