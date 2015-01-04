package week3.lesson5;

public class Figure {
	private double xPos, yPos, sideA;
	
	public Figure() {
		this(1,1,1);
	}
	
	public Figure(double x, double y, double a) {
		xPos = x;
		yPos = y;
		sideA = a;
	}
	public double getSideA() {
		return sideA;
	}
	
	public double getSquare() {
		return 0;
	}
	
	public double getPerimeter() {
		return sideA;
	}
	
}
