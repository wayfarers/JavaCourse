package tests;

import java.util.Arrays;

import jon.InsertionSorter;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsertionSorterTest {
	private void test(int[] array) {
		int[] sorted = array.clone();
		Arrays.sort(sorted);
		
		InsertionSorter.sortInsertion(array);
		for (int i = 0; i < sorted.length; i++) {
			assertEquals(sorted[i], array[i]);
		}
		
		System.out.println("=======");
	}
	
	//@Test
	public void testInsertionSort() {
		test(new int[]{3, 2, 0, 4, 3, 7, 1, 6, 5, 3});
	}
	
	@Test
	public void testInsertionSort2() {
		test(new int[]{3, 6, 2, 7, 5});
	}
	
	@Test
	public void testInsertionSort3() {
		test(new int[]{3, 1, 2, 3});
	}
	
	@Test
	public void testInsertionSort4() {
		test(new int[]{6, 3, 4, 5, 6});
	}
}

/**
 * 6 3 4 5 6
 * 3 6 4 5 6
 */
