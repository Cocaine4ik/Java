package Beginner;

import java.util.Scanner;

// Write an algorithm of increasing all three numbers, entering from the keyboard, variables to 5
// if both of the are equals. Else  output  «have no equals».

public class IfIncreaseValue {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Enter the 1 number: ");
		a = in.nextInt();
		System.out.print("Enter the 2 number: ");
		b = in.nextInt();
		System.out.print("Enter the 3 number: ");
		c = in.nextInt();
		
		if(a == b || a == c || b == c) {
			System.out.println("1 number = " + (a += 5));
			System.out.println("2 number = " + (b += 5));
			System.out.println("3 number = " + (c += 5));
		}
			
		else System.out.println("Have no equals!");
	}
}
