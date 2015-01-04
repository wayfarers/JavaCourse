package animals;

public class Animal<T extends Teller> {
	T specificAnimal = null;
	
	public Animal(T specificAnimal) {
		this.specificAnimal = specificAnimal;
	}
	
	public void say() {
		specificAnimal.say();
	}
}