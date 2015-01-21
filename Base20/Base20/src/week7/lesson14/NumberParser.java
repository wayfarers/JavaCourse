package week7.lesson14;

/*
 * Task 2. Запросить у пользователя число. Определить это целое число, дробное число или не число. 
 * (InputStreamReader и BufferedReader, без Scanner)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import static org.junit.Assert.*;
import org.junit.Test;


public class NumberParser {
	public static void main(String[] args) throws IOException {
		Reader isr = new InputStreamReader(System.in);
		BufferedReader whatNum = new BufferedReader(isr);
		String line = whatNum.readLine();
		
		System.out.println("Type is " + parse(line));
	}
	
	public static Type parse(String line) {
		char currentChar;
		Type numberIs = Type.INT;
		
		if (line.startsWith("-"))
			line = line.substring(1);
		
		if (line.contains(".")) {
			numberIs = Type.FRACTION;
			if (line.indexOf('.') != line.lastIndexOf('.'))
				numberIs = Type.OTHER;
		}
		for (int i = 0; i < line.length() && numberIs != Type.OTHER; i++) {
			currentChar = line.charAt(i);
			if (currentChar != '.' && (currentChar < '0' || currentChar > '9'))
				numberIs = Type.OTHER;
		}
		return numberIs;
	}
	
	public static class NumberParserTest {

		String [] args = {"10", "15.1", ".01", "1.0.2", "ds.d"};
		Type [] types = {Type.INT, Type.FRACTION, Type.FRACTION, Type.OTHER, Type.OTHER};

		@Test
		public void testParse() {
			for (int i = 0; i < args.length; i++) {
				assertEquals(parse(args[i]), types[i]);
			}
		}
		
		@Test
		public void testInt() {
			assertEquals(Type.INT, parse("12345"));
		}
		
		@Test
		public void negativeTest() {
			assertEquals(Type.INT, parse("-12345"));
		}
		
		@Test
		public void hitriyMinusTest() {
			assertEquals(Type.OTHER, parse("4-12345"));
		}
	}

}

enum Type {INT, FRACTION, OTHER}

