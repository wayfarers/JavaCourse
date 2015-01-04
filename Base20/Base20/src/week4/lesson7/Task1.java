package week4.lesson7;

import java.io.File;
import java.util.Scanner;
//C:\Users\wayfarer\workspace\Base20\src\week4\lesson7\folder1
public class Task1 {
	public static void main(String[] args) {
		String path, type, tmp;
		String[] files;
		int ind;
		Scanner scan = new Scanner(System.in);
		path = scan.nextLine();
		type = scan.nextLine();
		File f1 = new File(path);
		if(!f1.exists())
			System.out.println("No such file or directory");
		else {
			if(f1.isFile())
				System.out.println("This is a file");
			else {
				files = f1.list();
				for (String str : files) {
					ind = str.indexOf('.');
					tmp = str.substring(ind + 1);
					if(tmp.equals(type))
						System.out.println(str);
				}
			}
		}
			
			
	}
}
