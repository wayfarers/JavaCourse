package garbage;

public class BoxingExample {
	public static void main(String[] args) {
		Integer x = null;
		x = 4;
		print(x);
	}
	
	public static void print(int i) {
		System.out.println(i);
	}
}
