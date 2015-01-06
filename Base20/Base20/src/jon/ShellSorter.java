package jon;

public class ShellSorter {
	/**
	 * Суть алгоритма: выбирается d = длинна массива / 2;
	 * Начинается сортировка элементов с шагом в d, начиная с первого.
	 * Потом начиная со второго, и так далее,  пока не останется элементов. После этого шаг уменьшается в 2 раза.
	 * Сортировка заканчивается с шагом d = 1.
	 * 
	 * @author wayfarer
	 */
	public static void sortShell(int [] a) {
		for (int d = a.length / 2; d >= 1; d /= 2) {
			int shift = 0;					//сдвиг, для того, что бы начинать сначала с 1го элемента, потом 2го и т.д.
			while (d - shift >= 1) {
				for(int i = d + shift; i < a.length; i += d) {
					int j = i - d;
					if(a[i] < a[j]) {
						while (j >= 0 && a[i] < a[j]) { 
							j -= d;
						}
						j += d;
						//insert at [j]
						int insertionElement = a[i];
						for (int k = i; k > j; k -= d) {
							a[k] = a[k - d];
							System.out.println(k + " " + (k - d));
						}
						a[j] = insertionElement;
					}
				}
				shift++;
			}
		}
	}
}
