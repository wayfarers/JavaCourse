package autosalon;


import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String[] menuList = {"�������� ����� ����������", "�������� ����� ������",
			"��������� � ���� ������", "��������� �� ���� ������", "���������� ������ ����",
			"���������� ������ ��������", "���������� ����������� ���� �� ���������", "�����" };
	
	public void start() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int item, carIndex, trackIndex;
		do {
			
			showMenu(menuList);
			item = scan.nextInt();
			switch (item) {
			case 1:			//�������� ����� ����������
				System.out.println("������� ����� ������ ����");
				cars.add(new Car(scan.next()));
				System.out.println("���������� ��������\n");
				break;
			case 2:			//�������� ����� ������
				System.out.println("������� ����� ������ �������");
				tracks.add(new Track(scan.next()));
				System.out.println("������ ��������\n");
				break;
			case 3:			//��������� � ���� ������(������ �������� ���� � ��������)
				System.out.println("������� ����� ����, � �������� ����� ��������� ������");
				//String num_car = scan.next();
				carIndex = indexOfCar(scan.next());
				if (carIndex >= 0) {
					System.out.println("������� ����� �������, ������� ����� ���������");
					trackIndex = indexOfTrack(scan.next());
					if (trackIndex >= 0) {
						cars.get(carIndex).setTrack(tracks.get(trackIndex));
					}
				}
				break;
			case 4:			//��������� �� ���� ������(������ ������� ����).
				System.out.println("������� ����� ����");
				carIndex = indexOfCar(scan.next());
				if (carIndex >= 0) 
					cars.get(carIndex).unsetTrack();
				break;
			case 5:			//���������� ������ ����.
			{
				int i = 0;
				for (Car car : cars) {
					i++;
					System.out.println(i + ". " + car.getNumber());
				}
			}
				break;
			case 6:			//���������� ������ ��������.
			{
				int i = 0;
				for (Track track : tracks) {
					i++;
					System.out.println(i + ". " + track.getNumber());
				}
			}
				break;
			case 7:			//���������� ����������� ���� �� ���������.
			{
				int i = 0;
				for (Car car : cars) {
					if (car.getTrack() != null) {
						i++;
						System.out.println(i + ". ���� ����� " + car.getNumber() + " - ������ ����� " + car.getTrack().getNumber());
					}
				}
				if (i == 0)
					System.out.println("����������� �����������\n");
			}
				break;
			case 8:			//�����
				break;
			default:
				System.out.println("�������� �����, ���������� �����\n");
				break;
			}
			System.out.println();
		} while (item != 8);
	}
	private void showMenu(String[] menu) {
		int i = 1;
		System.out.println("�������� �����:");
		for (String item : menu) {
			System.out.println(i + ". " + item);
			i++;
		}
	}
	
	public int indexOfCar(String name) {
		for (Car car : cars) {
			if (car.getNumber().equals(name))
				return cars.indexOf(car);
		}
		System.out.println("������ � ������� " + name + " �� �������.");
		return -1;
	}
	
	public int indexOfTrack(String name) {
		for (Track track : tracks) {
			if (track.getNumber().equals(name))
				return tracks.indexOf(track);
		}
		System.out.println("������ � ������� " + name + " �� ������ .");
		return -1;
	}
}




































