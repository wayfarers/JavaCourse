package interfaceCalc;

public class Calc {
	AbstractProcessor proc;

	public Calc(AbstractProcessor pr) {
		proc = pr;
	}

	public void inSymv(char c) {
		proc.inputChar(c);
		proc.printResult();
	}
}
