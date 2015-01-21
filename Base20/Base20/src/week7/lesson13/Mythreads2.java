package week7.lesson13;

import java.util.ArrayList;

import week7.lesson13.MyThreads.Test;

/*
 * Task 2. Создать поток, который создаст 50 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут. 
 * Прерывание дочерних потоков должно выполнятся из потока их порождающего.
 */

public class Mythreads2 {
	public static Integer lock = 1;
	public static class SuperThread extends Thread {
		String name = "Main thread ";

		SuperThread(String name) {
			this.name += name;
		}

		public void run() {
			System.out.println(name);

			ArrayList<SecondaryThread> threads = new ArrayList<>();
			
			for (int i = 0; i < 50; i++) {
				threads.add(new SecondaryThread("" + i));
				threads.get(i).start();
			}

			for (SecondaryThread thread : threads) {
				thread.interrupt();
			}
		}
	}

	public static class SecondaryThread extends Thread {
		String name = "Secondary thread ";

		SecondaryThread(String name) {
			this.name += name;
		}
		
		public synchronized void doSomething() {
			System.out.println("Doing something");
		}

		public void run() {
			System.out.println(name);
			while (true) {
				synchronized (lock) {
					System.out.printf("%s - %s\n", name, "a");
					System.out.printf("%s - %s\n", name, "b");
					System.out.printf("%s - %s\n", name, "c");
					System.out.printf("%s - %s\n", name, "d");
				}
				
				if (isInterrupted()) {
					System.out.println(name + " - interrupted");
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread thr = new SuperThread("");
		thr.start();
	}
}
