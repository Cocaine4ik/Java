package ArraysAndMore;

// Write a program, when array is using to found average of 10 valuables type double.
// Use any 5 numbers.

public class ArrayAverage {
	public static void main(String args[]) {
		
		double m[] = { 1.1, 2.5, 6.7, 8.2, 9.3};
		double sum = 0;
		
		// print our array
		for(int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
			sum += m[i];
		}
		System.out.println("\nSummary is: " + sum);
		System.out.println("Average is: " + sum/2);
	}
}
