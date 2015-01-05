package jon;

/**
 * 1. Вывести элементы списка в обратном порядке, метод void printRevert()
 * 2. Добавление элемента в начало, метод void addFirst(int element)
 * 3. Добавление элемента в конец, метод void addLast(int element)
 * 4. Перестроить элементы в списке в обратном порядке, метод void revert()
 * 5. Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
 * 
 * @author wayfarer
 */
public class DoublyLinkList {
	private DNode first;
	private DNode last;
	private int lastIndex;
	
	public DoublyLinkList() {
		first = last = null;
		lastIndex = 0;
	}
	
	public void addLast(int value) {
		if(first == null) {
			first = new DNode(value);
			last = first;
		} else {
			DNode newLast = new DNode(value);
			last.setNext(newLast);
			newLast.setPrev(last);
			last = newLast;
			lastIndex++;
		}
	}
	
	public void addFirst(int value) {
		if(first == null) {
			first = new DNode(value);
			last = first;
		} else {
			DNode new_first = new DNode(value);
			new_first.setNext(first);
			first.setPrev(new_first);
			first = new_first;
			lastIndex++;
		}
	}
	
	public DNode getNode(int index) {
		DNode node = first;
		for (int i = 0; i < index; i++)
			node = node.getNext();
		return node;
	}
	
	public int get(int index) {
		DNode temp = getNode(index);
		return temp.getValue();
	}
	
	public int size() {
		return lastIndex + 1;
	}
	
	public void printRevert() {
		DNode temp = last;
		for (int i = 0; i <= lastIndex; i++) {
			System.out.print(temp.getValue());
			temp = temp.getPrev();
		}
	}
	
	public void revert() {
		DNode current = first;
		DNode temp;
		for (int i = 0; i <= lastIndex; i++) {
			temp = current.getNext();
			current.setNext(current.getPrev());
			current.setPrev(temp);
			current = current.getPrev();
		}
		temp = first;
		first = last;
		last = temp;
	}
	
	public void sortPartial(int index) {}
}

class DNode {
	private int value;
	private DNode next;
	private DNode prev;
	
	public DNode(int value) {
		this.value = value;
		next = null;
		prev = null;
	}
	
	public DNode getNext() {
		return next;
	}
	
	public DNode getPrev() {
		return prev;
	}
	
	public void setNext(DNode next) {
		this.next = next;
	}
	
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

