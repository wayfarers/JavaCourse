package week2.lesson3;

public class MyInteger {
	private int value;
	public MyInteger(int num) {
		value = num;
	}
	
	public void setValue(int num) {
		value = num;
	}
	public int getValue() {
		return value;
	}
	
	public MyInteger plus(MyInteger arg) {
		int newValue = value + arg.getValue();
		MyInteger newInt = new MyInteger(newValue);
		return newInt;
	}
	
}
