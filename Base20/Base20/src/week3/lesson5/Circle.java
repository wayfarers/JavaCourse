package week3.lesson5;

public class Circle extends Figure {
	public Circle(double x, double y, double a) {
		super(x, y, a);
	}

	@Override
	public double getSquare() {
		return Math.PI * getSideA() * getSideA();
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * getSideA();
	}
}
