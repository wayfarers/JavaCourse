package hw3;

public class Fish extends Product {
	private String name;
	
	public Fish() {
		name = "Tom";
	}
	public void cannibalism(Fish fish) {
		System.out.println("�� ����" + fish.name);
	}
	
	public void swim() {
		System.out.println("�����");
	}
}
