package Generic;

// Example of the simple generic method

public class GenericMethodDemo {

	// This generic method defines
	// Is arrays data equal
	static <T,V extends T> boolean arraysEqual(T[] x, V[] y) {
		// if arrays have different length, the can't be equal
		if(x.length != y.length) return false;
		
		for(int i = 0; i < x.length; i++)
			if(!x[i].equals(y[i]))
				return false; // arrays are different
			return true; // arrays are euqal
	}
	public static void main(String args[]) {
		
		Integer nums[] = { 1, 2, 3, 4, 5 };
		Integer nums2[] = { 1, 2, 3, 4, 5 };
		Integer nums3[] = { 1, 2, 7, 4, 5 };
		Integer nums4[] = { 1, 2, 7, 4, 5, 6 };
		
		// arguments type T and V implicitly defines
		// when method is called
		if(arraysEqual(nums, nums))
			System.out.println("nums equals nums");
		
		if(arraysEqual(nums, nums2))
			System.out.println("nums equals nums2");
		
		if(arraysEqual(nums, nums3))
			System.out.println("nums equals nums3");
		
		if(arraysEqual(nums, nums4))
			System.out.println("nums equal nums4");
		
		// create array with objects type Double
		Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		// next string won't compile, because
		// arrays types nums and dvals don't equals
		// System.out.println("nums equals dvals");
	}
}
