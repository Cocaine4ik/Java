package Recursion;

import java.util.Scanner;

// We have natural number n. Calculate sum of numerals.
// Strings, list, arrays and loops are forbidden.
public class SumNum {
	
	public static int SumNumerals(int n) {
		// base case
		if(n < 10) return n;
		// recursion step
		return n % 10 + SumNumerals(n / 10);
	}
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		SumNum r = new SumNum();
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		System.out.print(r.SumNumerals(n));
	}
}
