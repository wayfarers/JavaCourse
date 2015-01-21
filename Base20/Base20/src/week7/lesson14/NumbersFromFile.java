package week7.lesson14;

/*
 * Task 1. Написать метод принимающий имя файла, в котором содержатся числа через пробеллы и ентеры. 
 * Вывести в консоль числа из файла, увеличенные в два раза.
 * FileInputStream.
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class NumbersFromFile {
	public static void main(String[] args) throws IOException {
		System.out.println(new File(".").getAbsolutePath());
		InputStream fileStream = new FileInputStream("resources/numbers.txt"); //"resourses/numbers.txt"
		multiply(fileStream, System.out);
	}
	
	public static void multiply(InputStream stream, PrintStream out) throws IOException {
		int code = 1;
		int num;
		String myInt = "";
		while (code > -1) {
			code = stream.read(); 
			if (code >= 48 && code <= 57) {
				while (code >= 48 && code <= 57) {
					myInt += (char) code;
					code = stream.read();
				}
				num = Integer.valueOf(myInt);
				out.print(num * 2 + " ");
				myInt = "";
			} else if (code == 10 || code == 13)
				out.println();
		}
		stream.close();
	}
	
	public static class NumbersFromFileTest {
		@Test
		public void simpleTest() throws IOException {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream output = new PrintStream(baos);
			
			InputStream stream = new ByteArrayInputStream("3 4\r\n5 6\r\n7 8\r\n".getBytes());
			NumbersFromFile.multiply(stream, output);
			String result = baos.toString("ISO-8859-1");
			Assert.assertEquals("6 8 \r\n10 12 \r\n14 16 \r\n", result);
		}
	}
}
