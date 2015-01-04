package garbage;

public class EnumTest {
	public static void main(String[] args) {
		for (CarType type : CarType.values())
			System.out.println(type);
	}
}

enum CarType {
	AUTO, BICYCLE, TRUCK, FURA
}
