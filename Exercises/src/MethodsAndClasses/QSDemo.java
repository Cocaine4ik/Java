package MethodsAndClasses;

public class QSDemo {
	public static void main(String args[]) {
		
		char a[] = { 'd', 'X', 'a', 'r', 'p', 'j', 'i' };
		int i;
		
		System.out.print("Original array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]) ;
        
        System.out.println();
        
        // sort array
        
        QuickSort.qsort(a);
        
        System.out.print("Sorted array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
	}
}
