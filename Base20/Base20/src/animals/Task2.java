package animals;

public class Task2<T> {
	private T[] arr;
	public Task2(T[] arr) {
		this.arr = arr;
	}
	
	public T getElem(int i) {
		return arr[i];
	}
}
