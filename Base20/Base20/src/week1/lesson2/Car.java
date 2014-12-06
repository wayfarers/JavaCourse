package week1.lesson2;

public class Car {
	String number;
	String color;
	int status = 0;			//0 - не заведена, 1 - заведена, 3 - движение
	
	int countHuman = 0;
	public void addHuman(int p) {
		countHuman += p;
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