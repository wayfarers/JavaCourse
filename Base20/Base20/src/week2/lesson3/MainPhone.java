package week2.lesson3;

import java.util.Calendar;

public class MainPhone {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		Phone p1 = Phone.createPhone("123"); 
//		Phone p2 = new Phone("1dsd23");
//		Phone p3 = new Phone("1ds23");
//		Phone p4 = new Phone("1gf23");
//		Phone p5 = new Phone("1vb23");
//		Phone p6 = new Phone("12jh3");
//		Phone p7 = new Phone("1gh23");
//		Phone p8 = new Phone("1m523");
//		Phone p9 = new Phone("148623");
//		Phone p10 = new Phone("1ehh23");
//		Phone p11 = new Phone("12nmki3");
//		
//		p2.call("123");
//		p2.sendSms("123", "test message");
		p1.call("12nmki3");
		
		String[] base09 = Phone.getNumbers();
		for (String num : base09) {
			System.out.println(num);
		}	
	}
}
