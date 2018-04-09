package Recursion;

import java.util.Scanner;

// We have a natural number N. enter word YES, if number N is exact power of two,
// or word NO in else.
// Power function is forbidden!

public class TwoPow {

	public static int TwoPower(int n) {
				
		// base case
        if (n == 1) {
            return 1;
        } 
        // base case 
        else if (n > 1 && n < 2) {
            return 0;
        } 
        // recursion step
        else {
            return TwoPower(n / 2);
        }

	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		TwoPow t = new TwoPow();
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		if(t.TwoPower(n) == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
	
