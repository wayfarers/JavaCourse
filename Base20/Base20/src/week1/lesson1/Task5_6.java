package week1.lesson1;

import java.util.Scanner;

public class Task5_6 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first line:");
		String line1 = scan.nextLine();
		System.out.println("Enter second line:");
		String line2 = scan.nextLine();

		if (myEquals(line1, line2))
			System.out.println("Lines equal");
		else
			System.out.println("Lines not equal");

		int index = myIndexOf(line1, line2);
		if (index == -1)
			System.out.println("Not found");
		else
			System.out.println("Index is " + index);
	}

	public static boolean myEquals(String line1, String line2) {
		if (line1.length() != line2.length())
			return false;
		for (int i = 0; i < line1.length(); i++) {
			if (line1.charAt(i) != line2.charAt(i))
				return false;
		}
		return true;
	}

	public static int myIndexOf(String line1, String line2) {
		for (int i = 0; i <= line1.length() - line2.length(); i++) {
			int j = 0;
			for (j = 0; j < line2.length(); j++) {
				if (line1.charAt(i + j) != line2.charAt(j))
					break;
			}
			if (j == line2.length())
				return i;
		}
		return -1;
	}
}
