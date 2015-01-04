package week1.lesson1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		String line = readLine();
		while(true){
		char ch = readChar();
		int index = find(line, ch);
		System.out.println(index);
		}
	}
	
	public static String readLine(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		return line;
	}
	
	public static char readChar() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		return ch;
	}
	
	public static int find(String line, char ch) {
		int i = line.indexOf(ch);
		int size = line.length();
		int ind = i;
		if (i == -1) {
			System.out.println("Not found");
			return -1;
		}
		while ( (i >= 0) && (ind < size - 1) ){
			i = line.substring(ind+1).indexOf(ch);
			if (i > 0)
				ind += i + 1;
			else
				break;
		}
		return ind + 1; // компенсируем индексацию с нуля
	}
}
