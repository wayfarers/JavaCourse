package inretfaceTask;

public class HumanWoman extends AbstractHuman {
	
	public HumanWoman(String name) {
		super(name);
	}

	@Override
	public void printAboutMe() {
		System.out.println("Мой пол - женский");
	}
}
