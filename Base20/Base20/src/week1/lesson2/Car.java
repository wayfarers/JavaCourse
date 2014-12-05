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
		System.out.println("Я авто с номером " + number + ". " + "Мой цвет " + color);
	}
	
	public void start() {
		if(!engine) {
			engine = true;
			System.out.println("Авто с номером " + number + " завелось.");
		}
		else
			System.out.println("Авто с номером " + number + " не может завестись, т.к. уже заведено.");
	}
	
	public void move() {
		if (!movement && engine) {
			movement = true;
			System.out.println("Авто с номером " + number + " поехало.");
		}
		else if (engine)
			System.out.println("Авто с номером " + number + " не может поехать, т.к. уже едет.");
		else
			System.out.println("Авто с номером " + number + " не может поехать, т.к. двигатель остановлен.");
	}
	
	public void stop() {
		if (movement) {
			movement = false;
			engine = false;
			System.out.println("Авто с номером " + number + " остановилось.");
		} else
			System.out.println("Авто с номером " + number + " не может остановится, т.к. не едет.");
	}
}