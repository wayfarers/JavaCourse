package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String[] menuList = {"�������� ����� ����������", "�������� ����� ������",
			"��������� � ���� ������", "��������� �� ���� ������", "���������� ������ ����",
			"���������� ������ ��������", "���������� ����������� ���� �� ���������", "�����" };
	
	public void start() {
		
		//showMenu(menuList);
		Scanner scan = new Scanner(System.in);
		int item;
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
				int carIndex = indexOfCar(scan.next());
				if (carIndex >= 0) {
					System.out.println("������� ����� �������, ������� ����� ���������");
					int trackIndex = indexOfTrack(scan.next());
					if (trackIndex >= 0) {
						cars.get(carIndex).setTrack(tracks.get(trackIndex));
					}
				}
				break;
			case 4:			//��������� �� ���� ������(������ ������� ����).
	
				break;
			case 5:			//���������� ������ ����.
	
				break;
			case 6:			//���������� ������ ��������.
				
				break;
			case 7:			//���������� ����������� ���� �� ���������.
				
				break;
			case 8:			//�����
				
				break;
			default:
				
				break;
			}
		} while (true);
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
				return cars.indexOf(track);
		}
		System.out.println("������ � ������� " + name + " �� ������ .");
		return -1;
	}
}




































