package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import garbage.PrimeDividers;

public class PrimeDividersTest {

	@Test
	public void testIsPrime() {
		assertTrue(PrimeDividers.isPrime(5));
	}
	
	@Test
	public void testPrimeDividers() {
		assertEquals(PrimeDividers.findPrimeDividers(10).toString(), "[2, 5]");
	}

	@Test
	public void testPrimeDividers2() {
		assertEquals(PrimeDividers.findPrimeDividers(27).toString(), "[3]");
	}
	
	@Test
	public void testDividers() {
		assertEquals(PrimeDividers.findDividers(27).toString(), "[3, 9, 27]");
	}
}
