package week1.lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("file1.txt");
		Scanner scan = new Scanner(fr);
		int lineCounter = 0;
		while (scan.hasNextLine()) {
			lineCounter++;
			scan.nextLine();
		}
		scan.close();

		fr = new FileReader("file1.txt");
		scan = new Scanner(fr);

		String[] file = new String[lineCounter];
		for (int i = 0; i < lineCounter; i++) {
			file[i] = scan.nextLine();
		}
		scan.close();
		
		String[] encoded = encode(file, "encode"); // flag 1 - encode; 0 - decode
		//String[] decoded = encode(file, "decode");
		
		FileWriter fw = new FileWriter("file1.txt");
		for (String line : encoded) {
			fw.write(line + "\n");
		}
		fw.flush();
		fw.close();
		
	}

	public static String[] encode(String[] mas, String mode) {
		// 1 - encode, 0 - decode
		int shift = 0;
		if (mode == "encode")
			shift = 3;
		else if (mode == "decode")
			shift = -3;
		else
			System.out.println("Select correct mode: encode/decode");
		String[] coded = new String[mas.length];
		for (int i = 0; i < mas.length; i++) {
			coded[i] = "";
			for (int j = 0; j < mas[i].length(); j++) {
				if ((int) mas[i].charAt(j) == 32)
					coded[i] += " ";
				else
					coded[i] += "" + (char) ((int) mas[i].charAt(j) + shift);
			}
		}

		return coded;
	}

}
