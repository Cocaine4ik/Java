package ArraysAndMore;

public class MinMax2 {
	public static void main(String args[]) {
		//massive init
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int min, max;
		
		min = max = nums[0];
		
		for(int x : nums) {
			if (x < min) min = x;
			if (x > max) max =x;
		}
		System.out.println("min and max: " + min + " " + max);
	}
}
