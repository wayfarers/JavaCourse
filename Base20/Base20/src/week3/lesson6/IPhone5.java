package week3.lesson6;

public class IPhone5 extends IPhone {
	
	public IPhone5(int num, int id) {
		number = num;
		appleId = id;
	}
	
	@Override
	public int getAppleId() {
		System.out.println("I am IPhone5, my ID is " + appleId);
		return appleId;
	}

	@Override
	public void call(Phone phone) {
		System.out.println("IPhone5 " + getNumber() + " calling to " + phone.getNumber());
		
	}

	@Override
	public void getModel() {
		System.out.println(this.getClass().getName());
	}

}
