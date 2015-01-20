package week7.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExmple {
	public static void main(String[] args) throws IOException {
		Reader isr = new InputStreamReader(System.in);
		BufferedReader d = new BufferedReader(isr);

		String a = d.readLine();

		System.out.println("Вы напечатали: " + a);


		System.out.println(d.read());
		System.out.println(d.read());
		System.out.println(d.read());
		System.out.println(d.read());

	}
}
