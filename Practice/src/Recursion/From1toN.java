package Recursion;

import java.util.Scanner;

// We have a natural number - n. Enter all numbers from 1 to n.

public class From1toN {

	static int zero = 0;

	static public void OneToN(int n) {
		// base case		
		if(zero == n) {
			return;
		}
		// recursion step	
		zero++;
		System.out.print(zero + " ");
		OneToN(n);
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		From1toN a = new From1toN();
		
		System.out.print("n = ");
		int n = in.nextInt();
		
		a.OneToN(n);
	}
}
