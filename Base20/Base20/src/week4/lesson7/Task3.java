package week4.lesson7;

import java.io.File;
import java.io.IOException;

public class Task3 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\wayfarer\\workspace\\Base20\\src\\week4\\lesson7\\folder1";
		File folder = new File(path);
		if(folder.isDirectory()) {
			folder.createNewFile();
		}
			
	}
}
