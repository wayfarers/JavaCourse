package week1.lesson1;

import java.util.Scanner;

/*
 вводит с консоли целое число и выводит на экран 
 удвоенное 
 */
public class Task2example {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int resultat = m * 2;
		System.out.println(resultat);
	}

}