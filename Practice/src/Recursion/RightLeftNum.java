package Recursion;

import java.util.Scanner;

// We have a natural number n. Enter all numerals in reverse order,
// separate them with spaces or new strings.
// Strings, list, arrays and loops are forbidden.
// We can use only recursion and math.

public class RightLeftNum {

	public static int RLNum(int n) {
		// base case
		if(n < 10) return n;
			// recursion step
			System.out.print(n % 10 + " ");
			return RLNum(n / 10);
	}
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		RightLeftNum r = new RightLeftNum();
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		System.out.print(r.RLNum(n));
	}
}
