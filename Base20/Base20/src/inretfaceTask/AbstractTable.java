package inretfaceTask;

abstract public class AbstractTable implements Tablable {

	protected boolean isDry;
	
	@Override
	public void isDry() {
		if(isDry)
			System.out.println("Стол сухой");
		else
			System.out.println("Стол мокрый");
	}

	public void pourOnMe() {
		isDry = false;
	}
}
