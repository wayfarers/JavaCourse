package hw2;

public class Fraction {
	private double value;
	
	public Fraction(double value) {
		this.value = value;
	}
		
	public Fraction add(Fraction frac) {
		return new Fraction(value + frac.value);
	}
	public Fraction sub(Fraction frac) {
		return new Fraction(value - frac.value);
	}
	public Fraction mul(Fraction frac) {
		return new Fraction(value * frac.value);
	}
	public Fraction div(Fraction frac) {
		return new Fraction(value / frac.value);
	}
	public String toString() {
		return "" + value;
	}
	public void print() {
		System.out.println(value);
	}
}
