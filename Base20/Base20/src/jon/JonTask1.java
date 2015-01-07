package jon;

import java.util.Scanner;

public class JonTask1 {
	public static void main(String[] args) {
		int height, weight;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		height = scan.nextInt();
		weight = scan.nextInt();
		if (height <= 0 || weight <= 0) {
			System.out.println("Не верный размер массива");
			return;
		}
		int[][] array = new int[height][weight];
		for (int i = 0; i < height; i++)
			for (int j = 0; j < weight; j++) {
				array[i][j] = (int) (Math.random() * 10);
			}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < weight; j++)
				System.out.print(array[i][j]);
			System.out.println();
		}
	}
}
