package week1.lesson1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		Scanner scan2 = new Scanner(line);
		int count = 0;
		while(scan.hasNext()) {
			scan2.next();
			count++;
		}
		System.out.println(count);
		scan2.close();
	}
}
