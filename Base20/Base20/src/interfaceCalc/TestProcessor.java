package interfaceCalc;

public class TestProcessor extends AbstractProcessor {
	private String number = "";
	private char operation;
	public TestProcessor() {
		setTemp(0);
		setResult(0);
	}
	@Override
	public void inputChar(char c) {
		//System.out.println("¬ведено " + c);
		
		int ch = Character.getNumericValue(c);
		if(ch < 10 && ch >= 0) {
			number += c;
			setResult(Integer.parseInt(number));
//			setResult(ch);
//			if (getTemp() == 0)
//				setTemp(ch);
		}
		else if (c == '+' || c == '-' || c == '/' || c == '*') {
			operation = c;
			number = "";
			//if (getTemp() == 0)
				setTemp(getResult());
		}
		else if (c == '=') {
			if (operation == '+')
				setResult(getTemp() + getResult());
			else if (operation == '-')
				setResult(getTemp() - getResult());
			else if (operation == '/')
				setResult(getTemp() / getResult());
			else if (operation == '*')
				setResult(getTemp() * getResult());
		}
	}
}
