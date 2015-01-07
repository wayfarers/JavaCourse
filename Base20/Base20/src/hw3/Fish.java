package hw3;

public class Fish extends Product {
	private String name;
	
	public Fish() {
		name = "Tom";
	}
	public void cannibalism(Fish fish) {
		System.out.println("I'm eating a fish" + fish.name);
	}
	
	public void swim() {
		System.out.println("I'm swimming");
	}
}
