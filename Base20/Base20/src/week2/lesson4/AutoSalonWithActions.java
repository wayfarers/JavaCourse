package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalonWithActions {
	private ArrayList<Car> cars;
	private ArrayList<Track> tracks;
	
	private Action[] actions = {new AddCarAction(), new AddTrackAction()};
	
	public void start() {
		
		showMenu();
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();
		actions[item - 1].doAction();
		
	}
	private void showMenu() {
		int i = 1;
		System.out.println("Выберите пункт:");
		for (Action action : actions) {
			System.out.println(i + ". " + action.getName());
			i++;
		}
	}
	
	abstract class Action {
		abstract public String getName();
		abstract public void doAction();
	}
	
	class AddCarAction extends Action {

		@Override
		public String getName() {
			return "Добавить новый автомобиль";
			
		}

		@Override
		public void doAction() {
			// TODO Auto-generated method stub
			
		}
	}
	
	class AddTrackAction extends Action {

		@Override
		public String getName() {
			return "Добавить новый прицеп";
			
		}

		@Override
		public void doAction() {
			// TODO Auto-generated method stub
			
		}
	}
}
