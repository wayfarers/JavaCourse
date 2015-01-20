package week7.lesson13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Notepad {
	class Storage {
		Map<Calendar, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> tmp;
		
		public void add(String note, Calendar date) {
			if (map.containsKey(date)) {
				tmp = map.get(date);
				tmp.add(note);
			} else {
				tmp = new ArrayList<String>();
				tmp.add(note);
				map.put(date, tmp);
			}
		}
	}
	
	Storage str = new Storage();
	
	public void add(String note, Calendar date) {
		str.add(note, date);
	}
	
	public void printByDate(Calendar date) {
		System.out.println(date.getTime());
		for (String line : str.map.get(date)) {
			System.out.println(line);
		}
	}
}
