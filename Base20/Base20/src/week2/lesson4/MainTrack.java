package week2.lesson4;

public class MainTrack {
	public static void main(String[] args) {
		Track track1 = new Track("1");
		Track track2 = new Track("2");
		
		track1.roll();
		track2.roll();
		track1.roll();
		track1.stop();
		track2.stop();
		track2.stop();
		
	}
}
