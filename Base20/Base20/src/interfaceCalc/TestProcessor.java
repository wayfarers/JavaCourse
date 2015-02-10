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
			if (number.length() <= 10)
				setResult(Long.parseLong(number));
		}
		else switch (c) {
		case '+':
		case '-':
		case '/':
		case '*':
			operation = c;
			number = "";
			setTemp(getResult());
			break;
		case 'C':
			setTemp(0);
			setResult(0);
			operation = ' ';
			number = "";
			break;
		case '=':
			switch (operation) {
			case '+':
				setResult(getTemp() + getResult());
				break;
			case '-':
				setResult(getTemp() - getResult());
				break;
			case '/':
				setResult(getTemp() / getResult());
				break;
			case '*':
				setResult(getTemp() * getResult());
				break;
			default:
				break;
			}
			setTemp(0);
			operation = ' ';
			break;
		default:
			break;
		}
	}
}
