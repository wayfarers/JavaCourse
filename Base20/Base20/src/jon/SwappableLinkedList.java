package jon;

public class SwappableLinkedList extends RevertableLinkedList {
	public void revert() {
		for (int i = 0, j = lastIndex; j > i; i++, j--) {
			swap(i, j);
		}
	}
}
