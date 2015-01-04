package jon;

/**
 * 1. ������� �������� ������ � �������� �������, ����� void printRevert()
 * 2. ���������� �������� � ������, ����� void addFirst(int element)
 * 3. ���������� �������� � �����, ����� void addLast(int element)
 * 4. ����������� �������� � ������ � �������� �������, ����� void revert()
 * 5. �������� ����������� �������� ������, � ������ ���� ���������� ��������� Comparable, ����� void sortPartial(int index)
 * 
 * @author wayfarer
 */
public class DoublyLinkList {
	private Dnode first;
	private Dnode last;
	private int lastIndex;
	
	public DoublyLinkList() {
		first = last = null;
		lastIndex = 0;
	}
	
	public void addLast(int value) {
		if(first == null) {
			first = new Dnode(value);
			last = first;
		} else {
			Dnode newLast = new Dnode(value);
			last.setNext(newLast);
			newLast.setPrev(last);
			last = newLast;
			lastIndex++;
		}
	}
	
	public void addFirst(int value) {
		if(first == null) {
			first = new Dnode(value);
			last = first;
		} else {
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
	
	public void printRevert() {
		Dnode temp = last;
		for (int i = 0; i <= lastIndex; i++) {
			System.out.print(temp.getValue());
			temp = temp.getPrev();
		}
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

