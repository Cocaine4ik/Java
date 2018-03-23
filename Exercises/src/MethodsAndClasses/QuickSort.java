package MethodsAndClasses;

// Example number 6.3. Simple version of class Quicksort,
// which realize quick sort

public class QuickSort {

	// organize calling the specific method of quick sort
	
	static void qsort(char items[]) {
		qs(items, 0, items.length-1);
	}
	
	// recursive version of the quick characters sort
	
	private static void qs(char[] items, int left, int right) {
		
		int i, j;
		char x, y;
		i = left; j = right;
		x = items[(left + right) / 2];
		
		do {
			while((items[i]< x) && (i < right)) i++;
			while((x < items[i]) && (j > left)) j--;
			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++; j--;			
			}
		}
		while (i < j);
		
		if(left < j) qs(items, left, j);
		if(i < right) qs(items, i, right);
		
	}			
}
