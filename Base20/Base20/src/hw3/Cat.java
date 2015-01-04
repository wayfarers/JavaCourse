package hw3;


public class Cat extends Animal {
	boolean isHairRised = false;
	public Cat() {
		name = "Tom";
	}
	public Cat(String name) {
		this.name = name;
	}
	
	public void yellIfNotGorged() {
		if (food < 10)
			System.out.println("Mjaaau");
	}
	
	public void riseHair() {
		isHairRised = true;
	}
}
