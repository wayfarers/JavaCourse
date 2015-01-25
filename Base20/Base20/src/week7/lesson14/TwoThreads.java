package week7.lesson14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * Написать класс Monitor(nameFile1,nameFile2), в котором два потока.
 *
 * 1. Поток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
 * будит поток 2.(objSynchro.notify())
 *
 * 2. Поток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает. 
 * (objSynchro.wait()) 
 *
 * Примечание: 
 * 1. если с консоли введено слово "exit" или "quit", то поток №1 останавливать.
 * 2. продумать остановку и второго потока.
 */

public class TwoThreads {
	public static class Monitor {
		File file1, file2;
		Thread writer, copier;
		
		public Monitor(String nameFile1, String nameFile2) throws IOException {
			file1 = new File(nameFile1);
			file2 = new File(nameFile2);
			writer = new ThreadCreator(file1);
			copier = new ThreadWriter(file1, file2);
			
			writer.start();
			copier.start();
		}
	}
	
	public static class ThreadCreator extends Thread {
		Scanner scan = new Scanner(System.in);
		String line;
		FileWriter toFile;

		public ThreadCreator(File file1) throws IOException {
			if (!file1.exists()) 
				file1.createNewFile();
			toFile = new FileWriter(file1);

		}

		public void run() {
			while (!isInterrupted()) {
				synchronized (toFile) {
					if (scan.hasNextLine()) {
						line = scan.nextLine();
						if (line.equals("quit") || line.equals("exit")) {
							//остановить потоки
							return;
						}
					}
					
				}
			}
		}
	}
	
	public static class ThreadWriter extends Thread {
		
		public ThreadWriter(File fromFile, File toFile) {
			
		}

		public void run() {

		}

	}
	
	 public static void main(String[] args) {
		
	}
}
