package ArraysAndMore;
// using one of types of for-each loop for 
public class ForEach {
	public static void main(String args[]) {
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
// use one of types of for-each to summarize and display valuables
		for(int x:nums) {
			System.out.println("Value is: " + x);
			sum += x;
		}
		System.out.println("Summation: " + sum);
	}
}

