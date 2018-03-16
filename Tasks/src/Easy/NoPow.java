package Easy;

import java.util.Scanner;

//Calculate, with out using power function, function value z(x,m) = x^m sin^m(xm), for arguments values:
//x from -1.1 to 0.3 with step 0.2;
//m from 1 to 5 with step 1.

public class NoPow {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		FunctionNoPow fun = new FunctionNoPow();
		

		for(double x = -1.1; x <= 0.3; x += 0.2) {
			
			for(int m = 1; m <= 5; ++m) {
				System.out.println("Function value = " + fun.Z(x, m) + " When m = " + m);
				
			}
			System.out.println("Calculated when x " + x);
			System.out.println();
		}
			
	}
}
