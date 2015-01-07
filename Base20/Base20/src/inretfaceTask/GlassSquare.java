package inretfaceTask;

public class GlassSquare extends AbstractGlass {

	@Override
	public void pourFromMe() {
		System.out.println("Я, квадратный стакан, выливаюсь!");
		isFull = false;
	}
}
