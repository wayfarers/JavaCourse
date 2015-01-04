package week3.lesson5;

import java.util.Scanner;

public class MainConditioner {
	public static void main(String[] args) {
		BlockConditioner block = new BlockConditioner();
		Scanner scan = new Scanner(System.in);
		int index, cond_index;
		do {
			showMenu();
			index = scan.nextInt();
			switch (index) {
			case 1:
				block.getStat();
				break;
			case 2:
				System.out.println("Введите индекс кондиционера: 0-9");
				cond_index = scan.nextInt();
				if (cond_index < 10)
					block.turnOn(cond_index);
				else
					System.out.println("Неверный индекс");
				break;
			case 3:
				System.out.println("Введите индекс кондиционера: 0-9");
				cond_index = scan.nextInt();
				if (cond_index < 10)
					block.turnOff(cond_index);
				else
					System.out.println("Неверный индекс");
				break;
			case 4:
				System.out.println("Введите индекс кондиционера: 0-9");
				cond_index = scan.nextInt();
				if (cond_index < 10) {
					System.out.println("Введите температуру");
					block.setTemperature(cond_index, scan.nextInt());
				} else
					System.out.println("Неверный индекс");
				break;
			case 5:
				break;

			default:
				System.out.println("Неверный индекс");
				break;
			}
			System.out.println();
		} while (index != 5);
	}
	
	public static void showMenu() {
		String[] menu = {"Отобразить состояние всех кондиционеров", 
				"Включить кондиционер с индексом...", 
				"Выключить кондиционер с индексом...",
				"Установить температуру для кондиционера с индексом...",
				"Выход"};
		
		System.out.println("Выберите пункт:\n");
		for (int i = 1; i <= menu.length; i++) {
			System.out.println(i + ": " + menu[i-1]);
		}
		
	}
}
