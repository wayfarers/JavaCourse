package inretfaceTask;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<AbstractHuman> humans = new ArrayList<AbstractHuman>();
		ArrayList<AbstractTable> tables = new ArrayList<AbstractTable>();
		
		
		for (int i = 0; i < 4; i++) {
			int r = (int) Math.round(Math.random());
			if(r > 0)
				humans.add(new HumanMan("Man"));
			else
				humans.add(new HumanWoman("Woman"));
		}
		for (AbstractHuman human : humans) {
			human.printAboutMe();
			int r = (int) Math.round(Math.random());
			if(r > 0)
				human.takeGlass(new GlassCircle());
			else
				human.takeGlass(new GlassSquare());
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			tables.add(new Table());
		}
		
		for (AbstractHuman human : humans) {
			System.out.println("Введите индекс стола: ");
			human.pourWaterOnTable(tables.get(scan.nextInt()));
		}
		
		System.out.println();
		
		for (int i = 0; i < tables.size(); i++) {
			System.out.println("Table # " + i);
			tables.get(i).isDry();
		}
		System.exit(0);
	}		
}
