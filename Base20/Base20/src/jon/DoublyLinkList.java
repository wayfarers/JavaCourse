package jon;

//1. Вывести элементы списка в обратном порядке, метод void printRevert()
//2. Добавление элемента в начало, метод void addFirst(int element)
//3. Добавление элемента в конец, метод void addLast(int element)
//4. Перестроить элементы в списке в обратном порядке, метод void revert()
//5. Частично упорядочить элементы списка, в случае если реализован интерфейс Comparable, метод void sortPartial(int index)
public class DoublyLinkList {
	

	private Dnode first;
	private int lastIndex;
	
	public DoublyLinkList() {
		first = null;
		lastIndex = 0;
	}
	
	public void addLast(int value) {
		if(first == null)
			first = new Dnode(value);
		else {
			Dnode temp = first;
			Dnode last = new Dnode(value);
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(last);
			lastIndex++;
			last.setNext(temp);
		}
	}
	
	public void addFirst(int value) {
		if(first == null)
			first = new Dnode(value);
		else {
			Dnode new_first = new Dnode(value);
			new_first.setNext(first);
			first.setPrev(new_first);
			first = new_first;
			lastIndex++;
		}
	}
	
	public Dnode getNode(int index) {
		Dnode node = first;
		for (int i = 0; i < index; i++)
			node = node.getNext();
		return node;
	}
	
	public int get(int index) {
		Dnode temp = getNode(index);
		return temp.getValue();
	}
	
	public int size() {
		return lastIndex + 1;
	}
}

class Dnode {
	private int value;
	private Dnode next;
	private Dnode prev;
	
	public Dnode(int value) {
		this.value = value;
		next = null;
		prev = null;
	}
	
	public Dnode getNext() {
		return next;
	}
	
	public Dnode getPrev() {
		return prev;
	}
	
	public void setNext(Dnode next) {
		this.next = next;
	}
	
	public void setPrev(Dnode prev) {
		this.prev = prev;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

