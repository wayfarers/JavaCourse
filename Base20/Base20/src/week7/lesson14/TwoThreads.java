package week7.lesson14;

import java.io.File;
import java.io.FileNotFoundException;
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
		
		public Monitor(String nameFile1, String nameFile2) throws Exception {
			file1 = new File(nameFile1);
			file2 = new File(nameFile2);
			writer = new ThreadCreator(file1, this);
			copier = new ThreadWriter(file1, file2);
		}
		
		public void start() {
			writer.start();
			copier.start();
		}
		
		public void stop() {
			if (writer.isAlive())
				writer.interrupt();
			if (copier.isAlive())
				copier.interrupt();
		}
		
		
	}
	
	public static class ThreadCreator extends Thread {
		Scanner scan = new Scanner(System.in);
		String line;
		FileWriter toFile;
		File file1;
		Monitor mon;

		public ThreadCreator(File file1, Monitor mon) throws Exception {
			this.file1 = file1;
			this.mon = mon;
			if (!file1.exists()) 
				file1.createNewFile();
		}

		public void run() {
			while (!isInterrupted()) {
				synchronized (file1) {
					System.out.println("Thread 1 working");
					if (scan.hasNextLine()) {
						line = scan.nextLine();
						if (line.equals("quit") | line.equals("exit")) {
							mon.stop();
						}
					}
					try {
						toFile = new FileWriter(file1, true);
						toFile.write(line + "\n");
						toFile.close();
					} catch (IOException e) {
						System.out.println("Writing error.");
						e.printStackTrace();
						return;
					}
					file1.notify();
				}
			}
			System.out.println("Thread 1: interrupted");
		}
	}
	
	public static class ThreadWriter extends Thread {
		int symbol;
		FileWriter toFile;
		FileReader fromFile; 
		File file1, file2;
		
		public ThreadWriter(File fromFile, File toFile) {
			file1 = fromFile;
			file2 = toFile;
		}

		public void run() {
			while (!isInterrupted()) {
				synchronized (file1) {
					System.out.println("\tThread 2 working");
					if (!file1.exists())
						try {
							file1.wait();
							System.out.println("/tWaiting");
						} catch (InterruptedException e) {
							System.out.println("Thread waiting error");
							e.printStackTrace();
							return;
						}
					
					try {
						fromFile = new FileReader(file1);
						toFile = new FileWriter(file2);
					} catch (FileNotFoundException e) {
						System.out.println("Thread 2: file not found");
						e.printStackTrace();
						return;
					} catch (IOException e) {
						System.out.println("Thread 2: error writing file");
						e.printStackTrace();
						return;
					}
					
					try {
						while ((symbol = fromFile.read()) != -1) {
							toFile.write(symbol);
						}
						fromFile.close();
					} catch (IOException e) {
						System.out.println("Thread 2: error reading file");
						e.printStackTrace();
						return;
					}
					try {
						file1.wait();
					} catch (InterruptedException e) {
						break;
					}
				}
			}
			try {
				toFile.close();
			} catch (IOException e) {
				System.out.println("Thread 2: error closing file");
				e.printStackTrace();
			}
			System.out.println("Thread 2: interrupted");
		}

	}
	
	public static void main(String[] args) throws Exception {
		Monitor test = new Monitor("file1.txt", "file2.txt");
		test.start();
	}
}
