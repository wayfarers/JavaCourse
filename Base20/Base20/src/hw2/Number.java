package hw2;

public class Number {
	private int value;
	
	public Number(int num) {
		value = num;
	}
	public int get() {
		return value;
	}
	public Number add(Number num) {
		return new Number(value + num.value);
	}
	public Number sub(Number num) {
		return new Number(value - num.value);
	}
	public Number mul(Number num) {
		return new Number(value * num.value);
	}
	public Number div(Number num) {
		return new Number(value / num.value);
	}
	public Number pow(Number exponent) {
		if (value == 1 || exponent.value == 0)
			return new Number(1);
		else if (exponent.value < 0)
			return new Number(0);
		int intRes = value;
		for (int i = 0; i < exponent.value - 1; i++)
			intRes *= value;
		return new Number(intRes);
	}
	public Number fact() {
		int newValue = 1;
		if (value == 0)
			return new Number(1);
		else if (value < 0) {
			System.out.println("«начение дл€ факториала должно быть больше нул€.");
			return new Number(0);
		}
		for (int i = 1; i <= value; i++)
			newValue *= i;
		return new Number(newValue);
	}
	public Number mod(Number num) {
		return new Number(value % num.value);
	}
}
