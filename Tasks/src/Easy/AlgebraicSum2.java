package Easy;

import java.util.Scanner;
import java.util.ArrayList;

// Find Y, if Y = X1 + X2 + … + Xn,   X = Z^3 - B + A^2 / tg^2?.
// Number of  X are entering by user . For each X values Z, B, À, ? are different (entering by user).

// In this version of program we will use arrays and make all values for each X are different and unique.

public class AlgebraicSum2 {
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		System.out.print("Enter numbers of X: ");
		count = in.nextInt();
		double x, y = 0;
		
		ArrayList <Double> Z = new ArrayList <>(count);
		ArrayList <Double> B = new ArrayList <>(count);
		ArrayList <Double> A = new ArrayList <>(count);
		ArrayList <Double> Betta = new ArrayList <>(count);
		
		for(int i = 1; i <= count; i++) {
			System.out.println("Enter value of Z, B, A, Betta for X" + i + ": ");
			
			System.out.print("Z = ");
			Z.add(in.nextDouble());
			
			System.out.print("B = ");
			B.add(in.nextDouble());
			
			System.out.print("A = ");
			A.add(in.nextDouble());
			
			System.out.print("Betta = ");
			Betta.add(in.nextDouble());		
		}
		
		for (int i = 0; i < count; i++) {
			x = Math.pow (Z.get(i), 3) - B.get(i) + Math.pow(A.get(i), 2) / Math.pow(Math.tan(Betta.get(i)), 2);
			y += x;
		}
		System.out.println("y = " + y);
		}

}
