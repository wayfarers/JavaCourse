package week7.lesson13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NotepadMain {
	public static void main(String[] args) {
		Notepad n = new Notepad();
		Calendar date1 = new GregorianCalendar(2015,01,01); 
		n.add("первая запись", date1);
		n.add("вторая запись", date1);
		n.printByDate(date1);
	}
} 
