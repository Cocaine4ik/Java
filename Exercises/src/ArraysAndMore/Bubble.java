package ArraysAndMore;

// Bubble sorting logic demonstration
public class Bubble {
public static void main(String args[]) {
	
	int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
	int a, b, t;
	int size;	size = 10; //number of elements for sorting
	
	// show current massive
	
	System.out.println("Original array is:");
		for(int i = 0; i < size; i++)
			System.out.print(" " + nums[i]);
			System.out.println();
			
			//realize logic  of bubble sorting
			
			for(a = 1; a < size; a++)
				for(b = size-1; b >=a;  b--) {
					if(nums[b-1] > nums[b]) {
						
						// if require order is not observed - change elements places
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
					}
				}
			//show sorted massive
				System.out.println("Sorted array is: ");
					for(int i = 0; i < size; i++)
						System.out.print(" " + nums[i]);
						System.out.println();
}
}
