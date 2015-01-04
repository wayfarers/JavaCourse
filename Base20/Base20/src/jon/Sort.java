package jon;

public class Sort {
	public static void main(String[] args) {
//		int[] arr = new int[10];
		int[] arr = {0, 1, 2, 3, 4, 5, 5, 5, 6, 7 ,8, 9, 10};
		
//		for (int i = 0; i < arr.length; i++)
//			arr[i] = (int) (Math.random()*10);
//		for (int i : arr) {
//			i = (int) (Math.random()*10);
//		}
//		int[] arr2 = arr;
//		long time1, time2;
//		time1 = System.nanoTime();
//		bubbleSort(arr);
//		time2 = System.nanoTime();
//		print(arr);
		
//		System.out.print("BubbleSort, time elapsed: ");
//		System.out.println(time2 - time1 + " ms");
		
		
//		time1 = System.nanoTime();
//		selectionSort(arr2);
//		time2 = System.nanoTime();
//		print(arr2);
//		System.out.print("SelectionSort, time elapsed: ");
//		System.out.println(time2 - time1 + " ms");
		System.out.println(binarySearch(arr, 5));
		
		System.exit(0);
	}
	public static void bubbleSort(int[] array) {
		for (int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
//					tmp = array[i];
//					array[i] = array[i + 1];
//					array[i + 1] = tmp;
					swap(array, i, i + 1);
				}
			}
		}
	}

	public static void selectionSort(int[] array) {
		int minInd;
		for (int i = 0; i < array.length; i++) {
			minInd = findMin(array, i);
			swap(array, minInd, i);
		}
	}
	
	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	public static int findMin(int[] array, int start) {
		int min = array[start];
		int ind = start;
		for(int i = start; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				ind = i;
			}
		}
		return ind;
	}
	
	public static void swap(int[] array, int i1, int i2) {
		int tmp;
		tmp = array[i1];
		array[i1] = array[i2];
		array[i2] = tmp;
	}
	
	public static int binarySearch(int[] array, int val) {
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

/**
 * 10000 - 
 * 
 *   2^13 ~ 10000
 *   log2(10000)
*/ 