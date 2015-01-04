package week4.lesson7;

public class Element {
	private int value;
	private Element next;
	
	public Element(int value) {
		setValue(value);
	}
	public void setNext(Element next) {
		this.next = next;
	}
	
	public Element getNext() {
		return next;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
