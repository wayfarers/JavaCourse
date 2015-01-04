package week3.lesson5;

public class Square extends Figure {
	public Square(double x, double y, double a) {
		super(x, y, a);
	}
	
	@Override
	public double getSquare() {
		return getSideA() * getSideA();
	}
	
	@Override
	public double getPerimeter() {
		return getSideA() * 4;
	}
}
