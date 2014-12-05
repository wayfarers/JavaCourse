package week1.lesson1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String newLine = reverse(line);
		System.out.println(newLine);
	}
	
	public static String reverse(String line){
		String reverseLine = "";
		for (int i = 0; i < line.length(); i++) {
			reverseLine = line.charAt(i) + reverseLine;
		}
		return reverseLine;
	}
}