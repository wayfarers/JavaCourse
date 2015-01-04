package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {
	private ArrayList<Car> cars;
	private ArrayList<Track> tracks;
	private String[] menuList = {"�������� ����� ����������", "�������� ����� ������",
			"��������� � ���� ������", "��������� �� ���� ������", "���������� ������ ����",
			"���������� ������ ��������", "���������� ����������� ���� �� ���������", "�����" };
	
	public void start() {
		
		showMenu(menuList);
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();
		
	}
	private void showMenu(String[] menu) {
		int i = 1;
		System.out.println("�������� �����:");
		for (String item : menu) {
			System.out.println(i + ". " + item);
			i++;
		}
	}
}
