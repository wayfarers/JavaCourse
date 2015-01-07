package week4.lesson7;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File f1 = new File("d://book"); 
		File[] files = f1.listFiles();
		System.out.println(Arrays.toString(files));
		for(File t : files){System.out.print(t.getName()+", ");}
		System.out.println();
		System.out.println();

		File f2 = new File("d://book/html.txt");
		if(f2.isDirectory()) System.out.println("Это директория");
		else System.out.println("Это файл"); 
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(File.separatorChar);
		System.out.println();

		File f3 = new File("d://book/any.txt");
		if(f3.isDirectory()) System.out.println("Это директория");
		else System.out.println("Это файл"); 
		if(!f3.exists()) {
			f3.createNewFile();
			System.out.println("Новый файл");
		}
	}
}