package week3.lesson5;

public class Rectangle extends Square {
	private double sideB;
	public Rectangle(double x, double y, double a, double b) {
		super(x, y, a);
		sideB = b;
	}
	
	@Override
	public double getPerimeter() {
		return getSideA() * 2 + sideB * 2;
	}
	
	@Override
	public double getSquare() {
		return getSideA() * sideB;
	}
}
