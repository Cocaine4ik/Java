package Easy;

import java.util.Scanner;

// Exponentiate number, entered from the keyboard, in power n,
// power is entered from the keyboard too.
// Exponentiation must be organize with loops.

public class Exponentiation {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n, pow, number;
		
		
		System.out.print("Enter number:" );
		n = in.nextInt();
		
		number = n; System.out.println(number);
		
		System.out.print("Enter power:" );
		pow = in.nextInt();
		
		for(int i = 1; i < pow; i++) { // Exponentiate
			number *= n;
		}
		
		if(pow == 0) number = 1; // checking if power equals zero
		
		System.out.println(number);
	}
}
