package week2.lesson4;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car("1"));
		cars.add(new Car("2"));
		cars.add(new Car("3"));
		System.out.println(cars.get(0).getNumber());
		System.out.println("1");
		
	}
}
