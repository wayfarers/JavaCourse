package week7.lesson13;

import java.util.ArrayList;

public class MyThreads {
	public static class Test extends Thread{
		String name;
		Test(String name){
			this.name = name;
		}
		public void run(){
			System.out.println(name);
			while(true)
				if(isInterrupted()) {
					System.out.println(name + " - interrupted");
					return;
				}
		}
	}
	public static void main(String[] args) {
		ArrayList<Test> threads = new ArrayList<>();
			
		for (int i = 0; i < 100; i++) {
			threads.add(new Test("" + i));
			threads.get(i).start(); 
		}
		
		for (Test test : threads) {
			test.interrupt();
		}
	}
}
