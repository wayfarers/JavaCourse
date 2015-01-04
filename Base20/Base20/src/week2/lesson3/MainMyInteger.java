package week2.lesson3;

public class MainMyInteger {
	public static void main(String[] args) {
		MyInteger a = new MyInteger(10);
		MyInteger b = new MyInteger(5);
		MyInteger c;
		
		c = a.plus(b);
		System.out.println(c.getValue());
	}

}
