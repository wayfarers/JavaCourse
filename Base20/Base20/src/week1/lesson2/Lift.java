package week1.lesson2;

public class Lift {
	int currentFloor = 1;
	int totalFloorsPassed = 0;
	int totalHumansPassed = 0;
	int humansAtHome = 20; 			//начальное кол-во людей в доме

	public int move(int passengerOnFloor, int nextFloor, int countHuman) {
		// if (countHuman == 0) {
		// System.out.println("***Нет людей для перевозки***");
		// return -1;
		// } else
		if (nextFloor == currentFloor) {
			System.out.println("***Лифт уже на этом этаже***");
			return -1;
		} else if ((countHuman > humansAtHome) && (passengerOnFloor != 1)) {
			System.out.println("***Ошибка: Людей для перевозки больше, чем людей в доме***");
			return -1;
		}

		if (passengerOnFloor != currentFloor)
			move(currentFloor, passengerOnFloor, 0);
		if (nextFloor == 1) // едем на 1й этаж, люди выходяи из дома
			humansAtHome -= countHuman;
		if (currentFloor == 1)
			humansAtHome += countHuman; // едем с 1го этажа, люди заходят в дом
		if (nextFloor > currentFloor)
			totalFloorsPassed += nextFloor - currentFloor; // едем вверх
		else
			totalFloorsPassed += currentFloor - nextFloor; // едем вниз

		totalHumansPassed += countHuman;
		currentFloor = nextFloor;
		return 1;
	}
	
	public int getHumansCount() {
		return humansAtHome;
	}

	public void printAboutMe() {
		System.out.println("Текущий этаж: " + currentFloor);
		System.out.println("Всего перевезено людей: " + totalHumansPassed);
		System.out.println("Всего пройдено этажей : " + totalFloorsPassed);
		System.out.println("Людей сейчас в доме: " + humansAtHome);
		if (totalFloorsPassed >= 100)
			System.out.println("Требуется техническое обслуживание.");
		System.out.println();
	}
}
