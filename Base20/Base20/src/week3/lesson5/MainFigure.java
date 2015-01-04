package week3.lesson5;

public class MainFigure {
	public static void main(String[] args) {
		Triangle tri = new Triangle(0, 0, 3, 4, 5);
		Square squ = new Square(0, 0, 5);
		Circle cir = new Circle(0, 0, 5);
		Rectangle rec = new Rectangle(0, 0, 5, 10);
		
		Figure[] array = {tri, squ, cir, rec};
//		System.out.println(array[0].getPerimeter());
		for (Figure figure : array) {
			System.out.println("Периметр: " + figure.getPerimeter() + " Площадь: " + figure.getSquare());
		}
		System.exit(0);
	}

}
