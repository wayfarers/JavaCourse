package week1.lesson1;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String newLine = reverse(line);
		System.out.println(newLine);
	}

	public static String reverse(String line) {
		int size = line.length();
		for (int i = 1; i < size*2-1; i+=2) {
			line = line.charAt(i) + line;
		}
		return line.substring(0, size);
	}
}