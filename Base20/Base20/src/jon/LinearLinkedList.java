package jon;

public class LinearLinkedList extends RevertableLinkedList {
	public void revert() {
		Node newFirst, tmp, tmp2;
		newFirst = tmp = null;
		for (int i = 0; i <= lastIndex; i++) {
			tmp = first;
			first = first.getNext();
			tmp.setNext(newFirst);
			newFirst = tmp;
		}
		first = newFirst;
	}
}
