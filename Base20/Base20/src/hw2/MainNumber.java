package hw2;

public class MainNumber {
	public static void main(String[] args) {
		Number num1 = new Number(5);
		Number num2 = new Number(10);
		Number num3= new Number(-3);
		
		Number num_mul = num1.mul(num2);
		Number num_div = num2.div(num1);
		Number num_div2 = num2.div(num3);
		Number num_div3 = num1.div(num2);
		Number ost = num2.mod(num3);
		Number fact = num1.fact();
		Number power = num1.pow(num3);
		
		Number[] numbers = {num_mul, num_div, num_div2, num_div3, ost, fact, power};
		
		for (Number number : numbers) {
			System.out.println(number.get());
		}
		
		
	}
}
