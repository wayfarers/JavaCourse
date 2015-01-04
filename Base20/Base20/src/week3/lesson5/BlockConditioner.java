package week3.lesson5;

public class BlockConditioner {
	Conditioner[] cond = new Conditioner[10];
	public BlockConditioner() {
		for (int i = 0; i < 10; i++)
			cond[i] = new Conditioner();
	}
	public class Conditioner {
		private int temperature;
		private boolean isTurnedOn = false;
		public Conditioner() {
			this(20);
		}
		
		public Conditioner(int temp) {
			temperature = temp;
		}
		
		public void turnOn() {
			isTurnedOn = true;
		}
		
		public void turnOff() {
			isTurnedOn = false;
			System.out.println("Conditioner is turned off");
		}
		
		public void setTemperature(int temp) {
			temperature = temp;
		}
		
		public int getTemperature() {
			return temperature;
		}
		
		public void getTurn() {
			System.out.println("Turned on = " + isTurnedOn);
			System.out.println("Current temperature = " + temperature);
		}
	}
	
	public void getStat() {
		for (int i = 0; i < cond.length; i++) {
			System.out.println(i + 1 + ") ");
			cond[i].getTurn();
		}
	}
	
	public void turnOn(int i) {
		cond[i].turnOn();
		System.out.println("Conditioner is turned on");
	}
	
	public void turnOff(int i) {
		cond[i].turnOff();
		System.out.println("Conditioner is turned off");
	}
	
	public void setTemperature(int i, int temp) {
		cond[i].setTemperature(temp);
	}
}
