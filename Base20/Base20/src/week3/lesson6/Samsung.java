package week3.lesson6;

public class Samsung extends Phone{
	
	public Samsung(int num) {
		number = num;
	}
	@Override
	public void call(Phone phone) {
		System.out.println("Samsung " + getNumber() + " calling to " + phone.getNumber());
	}

	@Override
	public void getModel() {
		System.out.println(this.getClass().getName());
	}

}
