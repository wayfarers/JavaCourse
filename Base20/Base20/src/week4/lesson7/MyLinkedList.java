package week4.lesson7;

public class MyLinkedList {
	private Element first;
	private Element last;
	int count = 0;
	
	public void add(int value) {
		if(first == null) {
			first = new Element(value);
			count++;
		}
		else {
			last = first;
			while (last.getNext() != null)
				last = last.getNext();
			last.setNext(new Element(value));
			count++;
		}
	}
	
	public void add(Element elem) {
		if(first == null) {
			first = elem;
			count++;
		}
		else {
			last = first;
			while (last.getNext() != null)
				last = last.getNext();
			last.setNext(elem);
			count++;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public int getElement(int index) {
		last = first;
		for (int i = 0; i < index; i++)
			last = last.getNext();
		return last.getValue();
	}
	
	public void setElement(int index, int value) {
		last = first;
		for (int i = 0; i < index; i++)
			last = last.getNext();
		last.setValue(value);
	}
}
