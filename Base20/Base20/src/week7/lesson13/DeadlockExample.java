package week7.lesson13;

/**
 * A classical example of two threads dead-lock
 * @author wayfarer
 *
 */
public class DeadlockExample {
	
	public static void main(String[] args) throws InterruptedException {
		String lock1 = "AA";
		String lock2 = "BB";
		Thread thread1 = new SampleThread(" Thread 1 ", lock1, lock2);
		Thread thread2 = new SampleThread(" Thread 2 ", lock2, lock1);
		
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
	}
	
	static class SampleThread extends Thread {
		
		String lock1;
		String lock2;
		String name;
		
		public SampleThread(String name, String lock1, String lock2) {
			this.lock1 = lock1;
			this.lock2 = lock2;
			this.name = name;
			
//			while (taskQueue.isEmpty()) {
//				wait();
//				Thread.sleep(50);
//			}
//			while (true) {
//				if (taskQueue.isEmpty())
//					wait();
//			}
		}

		@Override
		public void run() {
			while (true) {
				System.out.println(name + "Waiting for lock " + lock1);
				synchronized (lock1) {
					System.out.println(name + "Aquired lock " + lock1);
					System.out.println(name + "Waiting for lock " + lock2);
					synchronized (lock2) {
						System.out.println(name + "Aquired lock " + lock2);
					}
					System.out.println(name + "Released lock " + lock2);
				}
				System.out.println(name + "Released lock " + lock1);
			}
		}
	}
}

