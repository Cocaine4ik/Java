package Recursion;

import java.util.Scanner;

// We have two integers A and Â (each in own string).
// Enter all numbers from A to B includes, in ascending order, if A < B,
// else in descending order.

public class FromAtoB {

	public static void AToB(int A, int B) {
		// task's condition
		if (A < B) {
			// base case #1
			if (A == B) {
				System.out.print(B);
				return;			
			}
			// recursion step #1
			System.out.print(A + " ");
			AToB(A + 1,B);
		}	
		else {
			// base case #2
			if (B == A) {
				System.out.print(A);
				return;
			}
			// recursion #2
			System.out.print(B + " ");
			AToB(A, B + 1);
		}
	}
	
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		FromAtoB a = new FromAtoB();
		
		System.out.print("A = ");
		int A = in.nextInt();
		System.out.print("B = ");
		int B = in.nextInt();
		
		a.AToB(A, B);
		
	}
}
