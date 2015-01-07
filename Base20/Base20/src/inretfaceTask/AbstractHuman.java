package inretfaceTask;

abstract public class AbstractHuman implements Humanable {
	protected String name;
	AbstractGlass glass;
	
	public AbstractHuman(String my_name) {
		name = my_name;
	}
	
	@Override
	abstract public void printAboutMe();
	
	@Override
	public void fillGlass() {
		glass.fillGlass();
	}
	
	@Override
	public void takeGlass(AbstractGlass glass) {
		this.glass = glass;
	}

	@Override
	public void putGlass() {
		this.glass = null;
	}
	
	@Override
	public void pourWaterOnTable(AbstractTable table) {
		if(glass == null)
			System.out.println("Нет стакана.");
		else {
			table.pourOnMe();
			glass.pourFromMe();
		}
		
	}
}
