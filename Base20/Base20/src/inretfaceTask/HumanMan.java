package inretfaceTask;

public class HumanMan extends AbstractHuman {
	
	public HumanMan(String name) {
		super(name);
	}

	@Override
	public void printAboutMe() {
		System.out.println("Мой пол - мужской");
	}
}
