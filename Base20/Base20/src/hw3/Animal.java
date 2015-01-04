package hw3;

public class Animal {
	String name;
	int food = 0;
	
	
	public void say() {
		System.out.println("I'm saying");
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void eat() {
		food++;
	}
}
