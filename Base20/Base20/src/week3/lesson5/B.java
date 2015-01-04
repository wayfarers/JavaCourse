package week3.lesson5;

public class B extends A {
	{
		System.out.println("non-static init B");
	}

	static {
		System.out.println("static init B");
	}
	public B() {
		System.out.println("constructor B");
	}

}
