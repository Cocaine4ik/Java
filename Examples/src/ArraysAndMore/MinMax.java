package ArraysAndMore;

public class MinMax {
	public static void main(String args[]) {
		
		int nums[] = new int[10];
		int min, max;
		
		nums[0] = 99;
		nums[1] = -9;
		nums[2] = 100123;
		nums[3] = 18;
		nums[4] = -978;
		nums[5] = 5623;
		nums[6] = 463;
		nums[7] = -9;
		nums[8] = 287;
		nums[9] = 49;
		
		min = max = nums[0]; // Assign 99 to max and min 
		
		for(int i = 1; i < 10; i++) {
			if(nums[i] < min)min = nums[i]; // compare min with 99
			if(nums[i] > max)max = nums[i]; // compare max with 99
		}
			System.out.println("min and max: " + min + " " + max);
	}
}

