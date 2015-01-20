package week7.lesson13;

public class TheadsExample {
	public static class Test extends Thread{
		String name;
		Test(String name){
			this.name = name;
		}
		public void run(){
			// sleep(6000);
			for(int i=0;i<2000;i++){

				System.out.println(name+i);
				if(isInterrupted())return;
			}
		}  
	}
	public static void main(String[] args) throws InterruptedException {
		Test thr1 = new Test("Thr1_");
		Test thr2 = new Test("\tThr2_");
		int example = 7;
		//
		System.out.println("статус1="+thr1.getState());//NEW 
		//
		if(example == 1){   
			thr1.start();
			System.out.println("статус2="+thr1.getState());//RUNNABLE
			thr2.start();   
		}
		//
		if(example == 2){
			thr1.start();
			thr1.join();//thr1.start().join();
			thr2.start();   
			System.out.println("статус3="+thr1.getState());//TERMINATED   
		}
		//
		if(example == 3){
			thr1.start();
			Thread.sleep(2000);   
			System.out.println("статус4="+thr1.getState());//TIMED_WAITING
		}
		//
		if(example == 4){
			thr1.setDaemon(false);
			thr1.start();
			System.out.println("end of Main");
		}
		//
		if(example == 5){
			thr1.setDaemon(true);
			thr1.start(); 
			System.out.println("end of Main");
		}
		//
		if(example == 6){
			thr1.start();   
			Thread.sleep(10);
			thr1.interrupt();
			//thr1.join();
			//Thread.sleep(1);
			System.out.println("статус5="+thr1.getState());
		}
		if(example == 7){
			thr1.start();   
			Thread.sleep(10);
			thr1.interrupt();
			thr1.join();
			System.out.println("статус6="+thr1.getState());
		}  
	}
}
