package Easy;

import java.util.Scanner;

// Find algebraicSum for the statement : 1^k + 2^k + 3^k + … + Nk.
// N and power k are entering by user.

public class AlgebraicSum3 {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int N, k, sum = 0;
		
		System.out.print("Enter N: ");
		N = in.nextInt();
		
		System.out.print("Enter power k: ");
		k = in.nextInt();
		
		for (int i = 1; i <= N; i++)  {
			
			sum += Math.pow(i, k);
		}
		System.out.print("Sum is: " + sum);		
	}
}
