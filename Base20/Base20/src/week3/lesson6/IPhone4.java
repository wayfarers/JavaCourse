package week3.lesson6;

public class IPhone4 extends IPhone {
	
	public IPhone4(int num, int id) {
		number = num;
		appleId = id;
	}

	@Override
	public int getAppleId() {
		System.out.println("I am IPhone4, my ID is " + appleId);
		return appleId;
	}

	@Override
	public void call(Phone phone) {
		System.out.println("IPhone4 " + getNumber() + " calling to " + phone.getNumber());
		
	}

	@Override
	public void getModel() {
		System.out.println(this.getClass().getName());
	}

}
