package interfaceCalc;

public class MainCalc {
	public static void main(String[] args) {
		AbstractProcessor processor = new TestProcessor();
		Calc calc = new Calc(processor);

		calc.inSymv('1');
		calc.inSymv('+');
		calc.inSymv('4');
		calc.inSymv('=');
	}
}
