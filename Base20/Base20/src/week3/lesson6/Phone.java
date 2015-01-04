package week3.lesson6;

abstract public class Phone {
	protected boolean touch, camera;
	protected int number, sideSize;
	
	abstract public void call(Phone phone);
	abstract public void getModel();
	
	public int getNumber() {
		return number;
	}
	
}
