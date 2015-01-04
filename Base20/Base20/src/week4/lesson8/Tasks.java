package week4.lesson8;

public class Tasks {
	public static void kTo2(int k) {
		System.out.println(k);
		if(k > 2)
			kTo2 (k - 1);
	}
	
	public static void from2toK(int k) {
		if(k > 2)
			from2toK (k - 1);
		System.out.println(k);
	}
	
//	public static int sum(int n) {
//		if(n > 9)
//			res = sum(res);
//		return res;
//	}
	
	public static int fib(int k) {
		if(k >= 2)
			return fib(k - 1) + fib(k - 2);
		else if (k == 1)
			return 1;
		else return 0;
		
	}
}
