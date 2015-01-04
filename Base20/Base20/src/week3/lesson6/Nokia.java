package week3.lesson6;

public class Nokia extends Phone {

	public Nokia(int num) {
		number = num;
	}
	@Override
	public void call(Phone phone) {
		System.out.println("Nokia " + getNumber() + " calling to " + phone.getNumber());
	}

	@Override
	public void getModel() {
		System.out.println(this.getClass().getName());
	}

}
