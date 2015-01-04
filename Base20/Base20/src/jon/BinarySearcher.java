package jon;

public class BinarySearcher {
	public int binarySearch(int[] array, int val) {
		int ref, index;
		int start = 0;
		int end = array.length - 1;
		ref = end / 2;
		boolean stop = false;
		index = -1;
		ref = (end - start) / 2;
		while (!stop) {
			if((end - start) < 2) {
				if (array[start] == val)
					index = start;
				else if (array[end] == val)
					index = end;
				stop = true;
			}
			if (val <= array[ref]) { //left side
				end = ref;
				ref = (end - start) / 2;
			} else {
				start = ref + 1;
				ref = (end + start) / 2;
			}
				
		}
		return index;
	}
}
