package garbage;

public class EnumTest {
	public static void main(String[] args) {
		for (CarType type : CarType.values())
			System.out.println(type);
		String line = "fghfHSjh";
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i) > 'A' & line.charAt(i) < 'Z') {
				System.out.println("" + (char)(line.charAt(i) + 1));
			}
		}
	}
}

enum CarType {
	AUTO, BICYCLE, TRUCK, FURA
}
