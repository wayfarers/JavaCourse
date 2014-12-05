package week1.lesson2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first line:");
		String line1 = scan.nextLine();
		System.out.println("Enter second line:");
		String line2 = scan.nextLine();

		int count = find(line1, line2);
		System.out.println(count);

	}

	public static int find(String line1, String line2) {
		int count = 0;
		for (int i = 0; i <= line1.length() - line2.length(); i++) {
			int j = 0;
			for (j = 0; j < line2.length(); j++) {
				if (line1.charAt(i + j) != line2.charAt(j))
					break;
			}
			if (j == line2.length())
				count++;
		}
		return count;
	}
}
