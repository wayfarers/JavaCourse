package week1.lesson2;

public class Car {
	String number;
	String color;
	boolean engine = false;
	boolean movement = false;
	
	int countHuman = 0;
	public void addHuman(int p) {
		countHuman += p;
	}
	public void printAboutMe() {
		System.out.println("� ���� � ������� " + number + ". " + "��� ���� " + color);
	}
	
	public void start() {
		if(!engine) {
			engine = true;
			System.out.println("���� � ������� " + number + " ��������.");
		}
		else
			System.out.println("���� � ������� " + number + " �� ����� ���������, �.�. ��� ��������.");
	}
	
	public void move() {
		if (!movement && engine) {
			movement = true;
			System.out.println("���� � ������� " + number + " �������.");
		}
		else if (engine)
			System.out.println("���� � ������� " + number + " �� ����� �������, �.�. ��� ����.");
		else
			System.out.println("���� � ������� " + number + " �� ����� �������, �.�. ��������� ����������.");
	}
	
	public void stop() {
		if (movement) {
			movement = false;
			engine = false;
			System.out.println("���� � ������� " + number + " ������������.");
		} else
			System.out.println("���� � ������� " + number + " �� ����� �����������, �.�. �� ����.");
	}
}