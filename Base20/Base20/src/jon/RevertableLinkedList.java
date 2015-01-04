package jon;

abstract public class RevertableLinkedList {
	abstract public void revert();
	
	class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public void setValue(int value) {
			this.value = value;
		}
		
		public void setNext(Node node) {
			next = node;
		}
		
		public Node getNext() {
			return next;
		}
	}
	
	protected Node first;
	protected int lastIndex = 0;
	
	public RevertableLinkedList() {
		first = null;
	}
	
	public void add(int value) {
		if (first == null)
			first = new Node(value);
		else {
			Node temp = first;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Node(value));
			lastIndex++;
		}
	}
	
	public void set(int index, int value) {
		Node temp = getNode(index);
		temp.setValue(value);
	}
	
	public int get(int index) {
		Node temp = getNode(index);
		return temp.getValue();
	}
	
	public void remove(int index) {
		if (index == 0)
			first = first.getNext();
		else {
			Node temp = getNode(index - 1);
			temp.setNext(temp.getNext().getNext());
		}
		lastIndex--;
	}
	
	public Node getNode(int index) {
		Node node = first;
		for (int i = 0; i < index; i++)
			node = node.getNext();
		return node;
	}
	
	public void swapFirstLast() {
		swap(0, lastIndex);
	}
	
	public int indexOf(int value) {
		Node temp = first;
		for (int i = 0; i <= lastIndex; i++) {
			if (temp.getValue() == value)
				return i;
			temp = temp.getNext();
		}
		return -1;
	}

	public int getCount() {
		return lastIndex + 1;
	}
	
	public void swap(int index1, int index2) {
		if (index1 > index2) {
			int t = index1;
			index1 = index2;
			index2 = t;
		} else if (index1 == index2 || index1 < 0 || index2 > lastIndex) {
			System.out.println("Wrong indexes");
			return;
		}
		
		Node node1 = getNode(index1); 
		Node node2 = getNode(index2);
		Node tmp1 = null;
		Node tmp2 = null;
		
		if (index1 == 0) {
			tmp2 = getNode(index2 - 1);
			first = node2;
		}
		else {
			tmp1 = getNode(index1 - 1);
			tmp2 = getNode(index2 - 1);
			tmp1.setNext(node2);
		}
		tmp2.setNext(node1);
		tmp1 = node1.getNext();
		node1.setNext(node2.getNext());
		node2.setNext(tmp1);
	}
}
