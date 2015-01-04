package week2.lesson4;

public class Track {
	private String number;
	private int status;
	private Car connectedTo;
	
	public Track(String num) {
		number = num;
		status = 0;
		connectedTo = null;
	}
	
	public void setConnectedCar(Car car) {
		if (car != connectedTo) {
			connectedTo = car;
			if (car.getTrack() != this)
				car.setTrack(this);
		}
	}
	
	public Car getConnectedTo() {
		return connectedTo;
	}
	
	public void roll() {
		if (status == 1)
			System.out.println("������ ����� " + number + " ��� �������");
		else {
			status = 1;
			System.out.println("������ ����� " + number + " ���������");
		}
	}
	
	public void stop() {
		if (status == 0)
			System.out.println("������ ����� " + number + " ��� �����");
		else {
			status = 0;
			System.out.println("������ ����� " + number + " �����������");
		}
	}
}
