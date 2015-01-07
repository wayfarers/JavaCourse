package week1.lesson1;
import java.util.Scanner;
/*
Inputs an int value from console and displays value * 2
 */
public class Task2example {


	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int resultat = m * 2;
		System.out.println(resultat);
	}


}