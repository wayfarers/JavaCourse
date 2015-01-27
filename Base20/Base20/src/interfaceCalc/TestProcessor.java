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
		//System.out.println("Input " + c);
		
		int ch = Character.getNumericValue(c);
		if(ch < 10 && ch >= 0) {
			number += c;
			setResult(Integer.parseInt(number));
		}
		else if (c == '+' || c == '-' || c == '/' || c == '*') {
			operation = c;
			number = "";
				setTemp(getResult());
		}
		else if (c == 'C') {
			setTemp(0);
			setResult(0);
			operation = ' ';
			number = "";
		}
		else if (c == '=') {
			if (operation == '+') {
				setResult(getTemp() + getResult());
				setTemp(0);
				operation = ' ';
			}
			else if (operation == '-') {
				setResult(getTemp() - getResult());
				setTemp(0);
				operation = ' ';
			}
			else if (operation == '/') {
				setResult(getTemp() / getResult());
				setTemp(0);
				operation = ' ';
			}
			else if (operation == '*') {
				setResult(getTemp() * getResult());
				setTemp(0);
				operation = ' ';
			}
		}
	}
}
