package week3.lesson5;

public class Triangle extends Figure {
	private double sideB;
	private double sideC;


	public Triangle(double x, double y, double a, double b, double c) {
		super(x, y, a);
		sideB = b;
		sideC = c;
	}

	@Override
	public double getPerimeter() {
		return getSideA() + sideB + sideC;
	}
	
	@Override
	public double getSquare() {
		double p = getPerimeter()/2;
		return Math.sqrt(p * (p - getSideA()) * (p - sideB) * (p - sideC));
	}

}
