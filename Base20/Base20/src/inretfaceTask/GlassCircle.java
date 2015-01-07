package inretfaceTask;

public class GlassCircle extends AbstractGlass {

	@Override
	public void pourFromMe() {
		System.out.println("Я, круглый стакан, выливаюсь!");
		isFull = false;
	}
}
