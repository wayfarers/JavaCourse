package week7.lesson14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.Integer;

public class NumbersFromFile {
	public static void main(String[] args) throws IOException {
		InputStream fileStream = new FileInputStream("numbers.txt");
		
		int code = 1;
		int num;
		String myInt = "";
		while (code > -1) {
			code = fileStream.read(); 
			if (code >=48 && code <= 57) {
				while (code >=48 && code <= 57) {
					myInt += (char) code;
					code = fileStream.read();
				}
				num = Integer.valueOf(myInt);
				System.out.println(num * 2);
				myInt = "";
			}
		}
		
		
//		Scanner file = new Scanner(fileStream);
//		boolean doIt = true;
		
//		while(doIt) {
//			if (file.hasNextLine()) {
//				String line = file.nextLine();
//				int n = Integer.parseInt(line);
////				System.out.print(n);
//			} else
//				doIt = false;
//		}	
	}
}
