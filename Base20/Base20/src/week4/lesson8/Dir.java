package week4.lesson8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dir {
	public static void getDir(String path) throws IOException {
		File file = new File("directory.txt");
		if (file.exists()) {
			FileReader read = new FileReader(file);
			Scanner scan = new Scanner(read);
			FileWriter write = new FileWriter(file);
		}
			
	}
}