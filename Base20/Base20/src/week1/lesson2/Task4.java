package week1.lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) throws Exception {
//		Scanner scan = new Scanner(System.in);
//		String filename = scan.nextLine();
		String filename = "param.txt";
		String[][] parameters = parse(filename);
		printParameters(parameters);
	}
	public static void  printParameters(String[][] parameters) {
		for (int i = 0; i < parameters[0].length; i++) {
			System.out.println(parameters[0][i] + " = " + parameters[1][i]);
		}
	}
	public static String[][] parse(String filename) throws FileNotFoundException {
		FileReader fr = new FileReader(filename);
		Scanner file = new Scanner(fr);
		String[][] parameters = new String[2][10];
		String line = "";		//сюда считаем весь файл
		while(file.hasNextLine()){
			line += file.nextLine();
		}
		file.close();
		int j = 0;
		int count = 0;
		for (int i = 0; i < line.length() - 1; i++) {
			if (line.charAt(i) == ';') {
				i++;
				count++;
				parameters[0][j] = "";
				parameters[1][j] = "";
				while (line.charAt(i) != '=') {
					parameters[0][j] += line.charAt(i);
					i++;
				}
				i += 2;
				while (line.charAt(i) != ']') {
					parameters[1][j] += line.charAt(i);
					i++;
				}
				j++;
			}
		}
		String[][] param_new = new String[2][count];
		
		for (int i = 0; i < count; i++) {
			param_new[0][i] = parameters[0][i];
			param_new[1][i] = parameters[1][i];
		}
		
		
		return param_new;
	}
}
