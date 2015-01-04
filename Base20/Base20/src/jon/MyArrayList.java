package jon;

public class MyArrayList {
	private int [] list;
	
	public MyArrayList() {
		list = new int[0];
	}
	
	public void add(int value) {
		int [] new_list = new int[list.length + 1];
		for (int i = 0; i < list.length; i++)
			new_list[i] = list[i];
		new_list[list.length] = value;
		list = new_list;
	}
	
	public int get(int index) {
		return list[index];
	}
	
	public boolean set(int index, int value) {
		if (index >= list.length)
			return false;
		list[index] = value;
		return true;
	}
	
	public int indexOf(int value) {
		for (int i = 0; i < list.length; i++)
			if (list[i] == value)
				return i;
		return -1;
	}
	
	public int size() {
		return list.length;
	}
	
	public boolean add(int index, int value) {
		if (index >= list.length)
			return false;
		int [] new_list = new int[list.length + 1];
		for (int i = 0; i < index; i++) {
			new_list[i] = list[i];
		}
		new_list[index] = value;
		for (int i = index + 1; i < new_list.length; i++) {
			new_list[i] = list[i - 1];
		}
		list = new_list;
		return true;
	}
	
	public int remove(int index) {
		int deleted;
		if (index >= list.length)
			return -1;
		int [] new_list = new int[list.length - 1];
		for (int i = 0; i < index; i++) {
			new_list[i] = list[i];
		}
		for (int i = index; i < new_list.length; i++) {
			new_list[i] = list[i + 1];
		}
		deleted = list[index];
		list = new_list;
		return deleted;
	}
}
