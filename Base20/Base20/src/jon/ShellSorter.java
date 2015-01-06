package jon;

public class ShellSorter {
	public static void sortShell(int [] a) {
		for (int d = a.length / 2; d >= 1; d /= 2) {

			for(int i = d; i < a.length; i += d) {
				int j = i - d;

				if(a[i] < a[j]) {
					while (j >= 0 && a[i] < a[j]) { 
						j -= d;
					}
					j += d;

					//вставить на место j
					int insertionElement = a[i];
					for (int k = i; k > j; k -= d) {
						a[k] = a[k - d];
						//System.out.println(k + " " + (k - 1));
					}
					a[j] = insertionElement;
					System.out.println(j + " " + i);
				}
			}
		}
	}
}
