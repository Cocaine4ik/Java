package Easy;

// Organize entering double-digit natural number from the keyboard.
// Program must identify minimum and maximum numerals, which are part of this natural number.

import java.util.Scanner;

public class MinMaxNumerals {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n, div, mod;
		
		System.out.println("\t\tMaximum and minimum numerals of the number\n");
		
		for ( ; ; ) {
			System.out.print("Enter number not bigger then 99: ");
			n = in.nextInt();
			if(n <= 99) break;
		}
		
		div = n / 10;
		mod = n % 10;
		
		if (div > mod) {
			System.out.println(div + " - Maximum numeral");
			System.out.println(mod + " -  Minimum numeral");
		}
		else if(div < mod) {
			System.out.println(div + " - Minimum numeral");
			System.out.println(mod + " -  Maximum numeral");
		}
		else System.out.println("Both numerals are equal");
		
	}
}
