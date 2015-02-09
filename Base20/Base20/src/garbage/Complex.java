package garbage;

public class Complex {
	double realPart;
	double imaginePart;
	
	public Complex(double realPart, double imaginePart) {
		this.realPart = realPart;
		this.imaginePart = imaginePart;
	}
	
	public Complex add(Complex c) {
		return Complex.add(this, c);
	}
	
	public Complex mult(Complex c) {
		return Complex.mult(this, c);
	}
	
	public static Complex add(Complex a, Complex b) {
		return new Complex(a.realPart + b.realPart, a.imaginePart + b.imaginePart);
	}
	
	public static Complex mult(Complex a, Complex b) {
		return new Complex((a.realPart * b.realPart - a.imaginePart * b.imaginePart),
				a.realPart * b.imaginePart + b.realPart * a.imaginePart);
	}
	
	public double abs() {
		return Math.sqrt(realPart + imaginePart);
	}
	
	@Override
	public String toString() {
		if (imaginePart > 0){
			return "" + realPart + " + " + imaginePart + "*i";
		} else {
			return "" + realPart + " - " + (-imaginePart) + "*i";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(
			new Complex(1, -10)
				.add(new Complex(1, 2))
				.add(new Complex(3, 2)));
	}
}
