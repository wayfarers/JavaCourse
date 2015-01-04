package jon;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import utils.Utils;

public class MainList {
	
	public static long getTime(long n, RevertableLinkedList list) {
		for (int i = 0; i < n; i++)
			list.add(i);
		
		long time = System.nanoTime();
		list.revert();
		return System.nanoTime() - time;
	}
	
	public static void getChartData() {
		List<Long> n = new ArrayList<Long>();
		List<Long> time = new ArrayList<Long>();
		
		for (int i = 1; i < 100; i++) {
			long N = 1L * i * 100;
			n.add(N);
			time.add(getTime(N, new SwappableLinkedList()) / 1000);
		}
		
		System.out.println("x = c(" + Utils.join(n) + ")");
		System.out.println("times = c(" + Utils.join(time) + ")");
	}
	
	public static void main(String[] args) {
		int N = 8000;
//		
//		System.out.println();
//		
		getChartData();
		//System.out.println(1.0 * getTimeLinear(10 * N) /  getTimeLinear(N));
		//System.out.println(1.0 * getTimeSwappable(10 * N) /  getTimeSwappable(N));
		
//		LinkList list = new LinkList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.revert2();
////		list.swap(0,1);
////		list.set(1, 10);
////		list.swapFirstLast();
//		for (int i = 0; i < list.getCount(); i++)
//			System.out.println(list.get(i));
//		System.out.println("Index is " + list.indexOf(5));
//		
//		MyArrayList list = new MyArrayList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(0, 10);
//		list.remove(2);
		
//		DoublyLinkList list = new DoublyLinkList();
//		list.addLast(1);
//		list.addLast(2);
//		list.addLast(3);
//		System.out.println("1");
//		list.addLast(4);
//		list.addLast(5);
//		
//		for (int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i));
	}
}
