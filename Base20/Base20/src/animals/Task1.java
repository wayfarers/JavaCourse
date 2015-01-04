package animals;

import java.util.ArrayList;

public class Task1 {
	public static <T> ArrayList<T> convert(T[] arr) {
		ArrayList<T> list = new ArrayList<T>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}
}
