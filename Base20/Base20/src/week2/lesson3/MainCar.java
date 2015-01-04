package week2.lesson3;

public class MainCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(Car.getCountCars());
		Car car2 = new Car();
		System.out.println(Car.getCountCars());
		Car car3 = new Car();
		System.out.println(Car.getCountCars());
		
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
		
		car1.setBrand("BMW");
		car2.setBrand("audi");
		System.out.println(car1.getBrand());
		System.out.println(car2.getBrand());
	}
}

