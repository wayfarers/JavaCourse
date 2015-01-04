package week3.lesson5;

public class A {
	{
		System.out.println("non-static init A");
	}

	static {
		System.out.println("static init A");
	}
	public A() {
		System.out.println("constructor A");
	}
}
