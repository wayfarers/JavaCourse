package garbage;

public class ExpRow {
	public static void main(String[] args) {
		double x = 7.0;
		System.out.println("x = " + x);
		double myExp = expSum(x);
		double mathExp = Math.exp(x);
		
		System.out.println("Sum result\t" + myExp);
		System.out.println("Math.exp(x)\t" + mathExp);
		System.out.println("Difference: " + (myExp - mathExp));
		
		System.exit(0);
	}

	public static double expSum(double x) {
		double sum = 0;
		double summand = 1;
		int power = 1;
		while (summand > 0) {
			sum += summand;
			summand = summand * x / power;
			power++;
		}
		System.out.println("Iterations number = " + power);
		return sum;
	}
}