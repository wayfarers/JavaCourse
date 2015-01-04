package week3.lesson6;

import java.util.ArrayList;

public class MainPhone {
	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<Phone>();
		
		list.add(new Nokia(123));
		list.add(new Samsung(456));
		list.add(new IPhone4(789, 1));
		list.add(new IPhone5(147, 2));
		
		list.get(0).call(list.get(1));
		list.get(0).getModel();
		
		for (Phone ph : list) {
			if(ph instanceof IPhone) {
				IPhone ph_i = (IPhone) ph;
				ph_i.getAppleId();
			}
			
		}
		
	}
}
