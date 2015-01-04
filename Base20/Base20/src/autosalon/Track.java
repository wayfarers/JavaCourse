package autosalon;

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
		if (car == null) {
			if (connectedTo.getTrack() == null) {
				connectedTo = null;
				System.out.println("������ ��������\n");
			} else 
				connectedTo.unsetTrack();
			//connectedTo = null;
			//System.out.println("������ ��������");
		} else 
			if (car != connectedTo) {
				//if (car.getTrack() == null) {
				if (car.getTrack() == this) {
					connectedTo = car;
//					if (car.getTrack() != this)
//						car.setTrack(this);
//					else System.out.println("���� ������ ��� ��������� �� ���� �������\n");
				} else System.out.println("� ���� ������ ��� ���� ������ ������\n");
			} else System.out.println("��� ������ � ������ ��� ����������\n");
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
	
	public String getNumber() {
		return number;
	}
}
