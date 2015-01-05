package tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import jon.DoublyLinkList;

import org.junit.Test;

public class DoublyLinkListTest {
	private void fill(DoublyLinkList list, boolean reverse) {
		if (reverse){
			for (int i = 1; i <= 5; i++)
				list.addFirst(i);
		} else {
			for (int i = 1; i <= 5; i++)
				list.addLast(i);
		}
	}
	
	@Test
	public void testAddFirst() {
		DoublyLinkList list = new DoublyLinkList();
		fill(list, true);
		for (int i = 0; i < list.size(); i++) {
			assertEquals(5 - i, list.get(i));
		}
	}
	
	@Test
	public void testAddLast() {
		DoublyLinkList list = new DoublyLinkList();
		fill(list, false);
		for (int i = 0; i < list.size(); i++) {
			assertEquals(i + 1, list.get(i));
		}
	}
	
	@Test
	public void testPrintRevert() {
		try {
			final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));
			DoublyLinkList list = new DoublyLinkList();
			fill(list, false);
			list.printRevert();
			assertEquals("54321", outContent.toString());
		} finally {
			System.setOut(null);
		}
	}
	
	@Test
	public void testRevert() {
		DoublyLinkList list = new DoublyLinkList();
		fill(list, true);
		list.revert();
		for (int i = 0; i < list.size(); i++) {
			assertEquals(i + 1, list.get(i));
		}
	}
}
