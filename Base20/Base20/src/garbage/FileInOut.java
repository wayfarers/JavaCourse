package garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileInOut {
	public static void main(String[]args)throws IOException {
		//		FileReader fr = new FileReader("numbers.txt");
		//		Scanner scan = new Scanner(fr);
		//		String result = "";
		//		String toWrite = "";
		//		while (scan.hasNextLine()){
		//			result = scan.nextLine();
		//		}
		//		for (int i = 0; i < result.length(); i++) {
		//			if (result.charAt(i) >= 'A' & result.charAt(i) <= 'Z')
		//				toWrite += result.charAt(i);
		//		}
		FileReader fr = new FileReader("text.txt");
		Scanner scan = new Scanner(fr);
		BufferedReader br = new BufferedReader(fr);
		String result = "";
		StringBuilder upperCase  = new StringBuilder();

		while (scan.hasNextLine()){
			result = scan.nextLine();
			for (int i = 0; i < result.length(); i++){

				if (Character.isUpperCase(result.charAt(i))){
					upperCase.append(result.charAt(i));
				}


			}


		}
		System.out.println(upperCase.toString());  
		
		
		String line1 = "gsdgcjkb,";
		String line2 = "";
		
		for (int i = line1.length(); i >= line1.length(); i--) {
			line2 += line1.charAt(i);
		}

	}
}