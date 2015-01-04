package directories;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirClass {
	class Methods {
		public String[] doIt(String path) {
			
			return null;
		}
	}
	public static void main(String[] args) throws IOException {
		String path = "D:\\folder1";
		String file_entry = "";
		File dir = new File(path);
		File file = new File(path + "\\directory.txt");
		if(dir.exists()) {
			if(!file.exists())
				file.createNewFile();
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine())
				file_entry += scan.nextLine() + "\n";
			
		}
		
	}
}
