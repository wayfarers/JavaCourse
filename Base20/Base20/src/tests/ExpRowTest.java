package tests;

import static org.junit.Assert.*;
import garbage.ExpRow;
import org.junit.Test;

public class ExpRowTest {
	int x = 10;

	@Test
	public void test() {
		assertTrue(Math.abs(Math.exp(x) - ExpRow.expSum(x)) < 1e-9);
	}

}
