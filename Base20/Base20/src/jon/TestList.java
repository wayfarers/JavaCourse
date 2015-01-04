package jon;

public class TestList {
	public static void main(String[] args) {
		RevertableLinkedList list = new LinearLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.revert();
		for (int i = 0; i < list.getCount(); i++)
			System.out.println(list.get(i));
	}
}
