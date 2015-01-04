package week2.lesson3;

public class Car {
	private static int countCars = 0;
	private String number;
	private String color;
	private int status = 0;			//0 - не заведена, 1 - заведена, 3 - движение
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
		System.out.println("Я авто с номером " + number + ". " + "Мой цвет " + color);
	}
	public void start() {
		if(status == 0) {
			status = 1;
			System.out.println("Авто с номером " + number + " завелось.");
		}
		else
			System.out.println("Авто с номером " + number + " не может завестись, т.к. уже заведено.");
	}
	public void move() {
		if (status == 1) {
			status = 3;
			System.out.println("Авто с номером " + number + " поехало.");
		}
		else if (status == 3)
			System.out.println("Авто с номером " + number + " не может поехать, т.к. уже едет.");
		else
			System.out.println("Авто с номером " + number + " не может поехать, т.к. двигатель остановлен.");
	}
	public void stop() {
		if (status == 3) {
			status = 0;
			System.out.println("Авто с номером " + number + " остановилось.");
		} else
			System.out.println("Авто с номером " + number + " не может остановится, т.к. не едет.");
	}
}
