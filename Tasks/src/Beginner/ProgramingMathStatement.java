package Beginner;

import java.util.Scanner;

// program next statement (à + b — f / à) + f * a * a — (a + b)
// numbers a, b, f are inputed from the keyboard. Organize  user interface,
// in this way, to be easy to understand how numbers are inputing. 

public class ProgramingMathStatement {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in); // create new scanner and return link for him
		int a, b, f, x;
		
		System.out.println("Pls enter numbers a, b, f: ");
		
		// endless loop. It will always warns user,
		// and asks user to enter a, while a is zero.
		
		for( ; ; ) {
			// enter a
			System.out.print("a = ");
			a = in.nextInt();
				//checking is "a" a zero
				if(a == 0) {
					System.out.println("a can't be a zero because in the statement f divided by a.");
					continue;
				}
				else break;
		}

			// enter b
			System.out.print("b = ");
			b = in.nextInt();
			
			// enter f
			System.out.print("f = ");
			f = in.nextInt();
		
		System.out.println("Calculate using a statement (à + b — f / à) + f * a * a — (a + b)");
		x = (a + b - (f / a)) + (f * a * a) - (a + b); // Calculate using a statement
		System.out.println("x = " + x);
	}
}
