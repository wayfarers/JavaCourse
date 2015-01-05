package jon;

public class InsertionSorter {
	public static void sortInsertion(int [] a) {
		for(int i = 1; i < a.length; i++) {
			int j = i - 1;
			
			if(a[i] < a[j]) {
				while (j >= 0 && a[i] < a[j]) { 
					j--;
				}
				j++;
				
				//вставить на место j
				int insertionElement = a[i];
				for (int k = i; k > j; k--) {
					a[k] = a[k - 1];
					System.out.println(k + " " + (k - 1));
				}
				a[j] = insertionElement;
				//System.out.println(j + " " + i);
			}
		}
	}
}
