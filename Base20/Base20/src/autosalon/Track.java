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
				System.out.println("Прицеп отцеплен\n");
			} else 
				connectedTo.unsetTrack();
			//connectedTo = null;
			//System.out.println("Прицеп отцеплен");
		} else 
			if (car != connectedTo) {
				//if (car.getTrack() == null) {
				if (car.getTrack() == this) {
					connectedTo = car;
//					if (car.getTrack() != this)
//						car.setTrack(this);
//					else System.out.println("Этот прицеп уже закреплен за этой машиной\n");
				} else System.out.println("У этой машины уже есть другой прицеп\n");
			} else System.out.println("Эти прицеп и машина уже закреплены\n");
	}

	public Car getConnectedTo() {
		return connectedTo;
	}
	
	public void roll() {
		if (status == 1)
			System.out.println("Прицеп номер " + number + " уже катится");
		else {
			status = 1;
			System.out.println("Прицеп номер " + number + " покатился");
		}
	}
	
	public void stop() {
		if (status == 0)
			System.out.println("Прицеп номер " + number + " уже стоит");
		else {
			status = 0;
			System.out.println("Прицеп номер " + number + " остановился");
		}
	}
	
	public String getNumber() {
		return number;
	}
}
