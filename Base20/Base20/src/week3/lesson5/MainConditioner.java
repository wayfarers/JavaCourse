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
				System.out.println("������� ������ ������������: 0-9");
				cond_index = scan.nextInt();
				if (cond_index < 10)
					block.turnOn(cond_index);
				else
					System.out.println("�������� ������");
				break;
			case 3:
				System.out.println("������� ������ ������������: 0-9");
				cond_index = scan.nextInt();
				if (cond_index < 10)
					block.turnOff(cond_index);
				else
					System.out.println("�������� ������");
				break;
			case 4:
				System.out.println("������� ������ ������������: 0-9");
				cond_index = scan.nextInt();
				if (cond_index < 10) {
					System.out.println("������� �����������");
					block.setTemperature(cond_index, scan.nextInt());
				} else
					System.out.println("�������� ������");
				break;
			case 5:
				break;

			default:
				System.out.println("�������� ������");
				break;
			}
			System.out.println();
		} while (index != 5);
	}
	
	public static void showMenu() {
		String[] menu = {"���������� ��������� ���� �������������", 
				"�������� ����������� � ��������...", 
				"��������� ����������� � ��������...",
				"���������� ����������� ��� ������������ � ��������...",
				"�����"};
		
		System.out.println("�������� �����:\n");
		for (int i = 1; i <= menu.length; i++) {
			System.out.println(i + ": " + menu[i-1]);
		}
		
	}
}
