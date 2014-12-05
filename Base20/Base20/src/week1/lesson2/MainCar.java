package week1.lesson2;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.number = "1";
		car1.color = "blue";
		car2.number = "2";
		car2.color = "red";
		car3.number = "3";
		car3.color = "white";
		
//		car1.printAboutMe();
//		car2.printAboutMe();
//		car3.printAboutMe();
		car1.start();
		car2.start();
		car3.start();
		car1.move();
		car2.move();
		car2.start();
		car1.move();
		car1.stop();
		car2.stop();
		car3.stop();
		
		
	}
}

