package week7.lesson14;

/*
 * Task 2. Запросить у пользователя число. Определить это целое число, дробное число или не число. 
 * (InputStreamReader и BufferedReader, без Scanner)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class NumberParser {
	public static void main(String[] args) throws IOException {
		Reader isr = new InputStreamReader(System.in);
		BufferedReader whatNum = new BufferedReader(isr);
		Type numberIs = Type.INT;
		char currentChar;
		
		String line = whatNum.readLine();
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
		
		System.out.println("Type is " + numberIs);
	}
}

enum Type {INT, FRACTION, OTHER}
