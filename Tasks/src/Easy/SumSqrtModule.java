package Easy;

// We have simple array, array length defines by user.
// Calculate sum of square this numbers, which module is more then 2.5

import java.util.Scanner;
// import java.util.ArrayList;

public class SumSqrtModule {
	public static void main(String args[]) {
		
		// ArrayList <Double> m = new ArrayList <> ();
		
		Scanner in = new Scanner(System.in);
		double result = 0;
		
		// user enter arrya's length from the keyboard
		
		System.out.print("Enter array's length: ");
		int i = in.nextInt(); 
		
		// create empty array with length entered by user
		
		double a[] = new double[i];
		
		// input data in to array
		
		for(double j = 0; j < i; j++) {
			a[(int) j] = (double)j;
			if(Math.abs(j) > 2.5) // check if array element module is more then 2.5
				result += Math.pow(j, 2); // summarize right elements with power two
		}
		
		// output array data
		
		for(double j = 0; j < i; j++) {
			System.out.print((double)a[(int) j] + " ");
		}
		
		// output sum
		
		System.out.println("Sum = " + result);
		
	}

}
