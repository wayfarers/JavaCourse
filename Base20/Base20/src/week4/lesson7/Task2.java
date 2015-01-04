package week4.lesson7;

import java.io.File;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		String path, type, tmp;
		File[] files;
		int ind;
		Scanner scan = new Scanner(System.in);
		path = scan.nextLine();
		//type = scan.nextLine();
		File f1 = new File(path);
		if(!f1.exists())
			System.out.println("No such file or directory");
		else {
			if(f1.isFile())
				System.out.println("This is a file");
			else {
				files = f1.listFiles();
				for (File file : files) {
					if(file.isDirectory())
						System.out.println(file.getName());
				}
			}
		}


	}
}
