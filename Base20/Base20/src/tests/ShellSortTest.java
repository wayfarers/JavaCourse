package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import jon.ShellSorter;

import org.junit.Test;

public class ShellSortTest {

	private void test(int[] array) {
		int[] sorted = array.clone();
		Arrays.sort(sorted);
		
		ShellSorter.sortShell(array);
		for (int i = 0; i < sorted.length; i++) {
			assertEquals(sorted[i], array[i]);
		}
		
		System.out.println("=======");
	}
	
	//@Test
	public void testInsertionSort() {
		test(new int[]{3, 2, 0, 4, 3, 7, 1, 6, 5, 3});
	}
	
	//@Test
	public void testInsertionSort2() {
		test(new int[]{6, 7, 7, 6, 3, 6, 3, 4, 5});
	}
	
	@Test
	public void testInsertionSort3() {
		test(new int[]{4, 3, 4, 4, 2});
	}
	
	//@Test
	public void testInsertionSort4() {
		test(new int[]{6, 3, 4, 5, 6});
	}

}
