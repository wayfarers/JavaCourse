package week2.lesson3;

public class Car {
	private static int countCars = 0;
	private String number;
	private String color;
	private int status = 0;			//0 - �� ��������, 1 - ��������, 3 - ��������
	private String brand = "Black";
	int countHuman = 0;

	public Car() {
		this("","");
	}
	public Car(String num) {
		this(num, "Black");
	}
	public Car(String num, String col) {
		countCars++;
		setColor(col);
		setNumber(num);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String num) {
		number = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String col) {
		color = col;
	}

	public void addHuman(int p) {
		countHuman += p;
	}
	public void	setBrand(String name) {
		if (name == "BMW" || name == "Audi" || name == "VW")
			brand = name;
		else
			System.out.println("Auto with number" + number + ": Wrong brand format");
	}
	public String getBrand() {
		return brand;
	}
	public static int getCountCars() {
		return countCars;
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
