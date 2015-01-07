package week2.lesson4;

public class DivInitial {
	int p;
	{
		p = 10;
		System.out.println("Блок инициализации1");
	}
	{
		p = 20;
		System.out.println("Блок инициализации2");
		f();
	}

	static{
		System.out.println("static Блок инициализации");
		//f();
	}
	public DivInitial(){
		System.out.println("Конструктор");
	} 
	public void f(){

	}
}
