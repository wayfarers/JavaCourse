package week1.lesson2;

public class MainLift {
	public static void main(String[] args) {
		Lift lift = new Lift();
		int fromFloor;
		int toFloor;
		int humans;
		int humansAtHome;
		
		long time = System.nanoTime();
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i + ": " + (System.nanoTime() - time) + " nanoseconds passed");
			time = System.nanoTime();
			System.out.print(i + ". ");
			humansAtHome = lift.getHumansAtHome();
			fromFloor = (int) (Math.random() * 16) + 1;
			toFloor = (int) (Math.random() * 16) + 1;
			
			if ((fromFloor != 1) && (humansAtHome < 5))
				humans = (int) (Math.random() * humansAtHome) + 1;
			else
				humans = (int) (Math.random() * 5) + 1;
			
			if (lift.move(fromFloor, toFloor, humans))
				lift.printAboutMe();
		}
	}

	
}
