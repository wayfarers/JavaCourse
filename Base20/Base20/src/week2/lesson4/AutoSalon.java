package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String[] menuList = {"Добавить новый автомобиль", "Добавить новый прицеп",
			"Закрепить к авто прицеп", "Открепить от авто прицеп", "Отобразить список авто",
			"Отобразить список прицепов", "Отобразить закрепления авто за прицепами", "Выход" };
	
	public void start() {
		
		//showMenu(menuList);
		Scanner scan = new Scanner(System.in);
		int item;
		do {
			showMenu(menuList);
			item = scan.nextInt();
			switch (item) {
			case 1:			//Добавить новый автомобиль
				System.out.println("Введите номер нового авто");
				cars.add(new Car(scan.next()));
				System.out.println("Автомобиль добавлен\n");
				break;
			case 2:			//Добавить новый прицеп
				System.out.println("Введите номер нового прицепа");
				tracks.add(new Track(scan.next()));
				System.out.println("Прицеп добавлен\n");
				break;
			case 3:			//Закрепить к авто прицеп(запрос индексов авто и прицепов)
				System.out.println("Введите номер авто, к которому нужно прицепить прицеп");
				//String num_car = scan.next();
				int carIndex = indexOfCar(scan.next());
				if (carIndex >= 0) {
					System.out.println("Введите номер прицепа, который нужно прицепить");
					int trackIndex = indexOfTrack(scan.next());
					if (trackIndex >= 0) {
						cars.get(carIndex).setTrack(tracks.get(trackIndex));
					}
				}
				break;
			case 4:			//Открепить от авто прицеп(запрос индекса авто).
	
				break;
			case 5:			//Отобразить список авто.
	
				break;
			case 6:			//Отобразить список прицепов.
				
				break;
			case 7:			//Отобразить закрепления авто за прицепами.
				
				break;
			case 8:			//Выход
				
				break;
			default:
				
				break;
			}
		} while (true);
	}
	private void showMenu(String[] menu) {
		int i = 1;
		System.out.println("Выберите пункт:");
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
		System.out.println("Машина с номером " + name + " не найдена.");
		return -1;
	}
	
	public int indexOfTrack(String name) {
		for (Track track : tracks) {
			if (track.getNumber().equals(name))
				return cars.indexOf(track);
		}
		System.out.println("Прицеп с номером " + name + " не найден .");
		return -1;
	}
}




































