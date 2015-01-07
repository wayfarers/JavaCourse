package inretfaceTask;

abstract public class AbstractGlass implements Glassable {
	protected String glassType;
	protected boolean isFull = true;
	
	@Override
	abstract public void pourFromMe();
	
	public void fillGlass() {
		isFull = true;
	}
}
