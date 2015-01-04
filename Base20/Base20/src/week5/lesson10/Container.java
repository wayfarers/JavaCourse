package week5.lesson10;

public class Container<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
// Container<String> cont1 = new Container<String>();
// Container<Double> cont2 = new Container<Double>();


//public class JenericMethods {
//	public static <T> void swap (T[] a, int x, int y) {
//		T temp = a[x];
//		a[x] = a[y];
//		a[y] = temp;
//	}
//	public static void main(String[] args) {
//		String[] a = new String[10];
//		JenericMethods.<String>swap (a, 1, 2);
//
//		Integer[] b = new Integer[10];
//		JenericMethods.<Integer>swap (b, 1, 2);
//
//		Container[] conts = new Container[10];
//		JenericMethods.<Container>swap (conts, 2, 2);
//	}
//}

