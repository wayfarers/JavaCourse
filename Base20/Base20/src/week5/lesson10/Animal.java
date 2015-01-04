package week5.lesson10;

public class Animal<T> {
	T anim = null;
	Object[] A = {new Cat(), new Dog(), new Leo()};
	int i = 0;
	boolean doit = true;
	
	public Animal() {
		while(doit) {
//			try {
//				anim = (T) A[i];
//				//doit = false;
//			} catch (Exception e) {i++;}
			anim = (T) A[i];
			i++;
		}
		
	}
	
	public void say() {
		((Animals) anim).say();
	}
}