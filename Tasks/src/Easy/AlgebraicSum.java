package Easy;

import java.util.Scanner;

// Find Y, if Y = X1 + X2 + … + Xn,   X = Z^3 - B + A^2 / tg^2?.
// Number of  X are entering by user . For each X values Z, B, À, ? are different (entering by user).

public class AlgebraicSum {
	public static void main(String args[]) {
		
	Scanner in = new Scanner(System.in);
	int counter = 0;
	double x, Z, B, A, Betta, y = 0;
		
	for( ; ; ) {
		System.out.print("Enter number of X: ");
		counter = in.nextInt();
		if(counter >= 1) break;
		else System.out.println("Number of X must be 1 or more! Try again");
		}
	
	for(int i = 1; i <= counter; i++) {
		
		System.out.println("Enter value of Z, B, A, Betta for X" + i + ": ");
		
		System.out.print("Z = ");
		Z = in.nextInt();
		
		System.out.print("B = ");
		B = in.nextInt();
		
		System.out.print("A = ");
		A = in.nextInt();
		
		System.out.print("Betta = ");
		Betta = in.nextInt();
		
		x = Math.pow(Z, 3) - B + Math.pow(A, 2) / Math.pow(Math.tan(Betta), 2);
		y +=x;
		
	}
	System.out.println("y = " + y);
	}
}
