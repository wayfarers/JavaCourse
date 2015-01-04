package jon;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkListTest {

	private void test(RevertableLinkedList list) {
		for (int i = 1; i <= 10; i++)
			list.add(i);
		list.revert();
		for (int i = 0; i < 10; i++)
			assertEquals(10 - i, list.get(i));
	}

	@Test
	public void testLinear() {
		test(new LinearLinkedList());
	}

	@Test
	public void testSwappable() {
		test(new SwappableLinkedList());
	}
}
