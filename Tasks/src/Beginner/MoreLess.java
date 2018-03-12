package Beginner;

import java.util.Scanner;

// Write a program, which asking to input 2 numbers. If the first number is more then the second
// this program write word "MORE". If the first number is less then the second, program prints word "LESS".
// And if both number are equals, program print the message - "NUMBERS ARE EQUALS".

public class MoreLess {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Enter the 1 number: ");
		a = in.nextInt();
		System.out.print("Enter the 2 number: ");
		b = in.nextInt();
		
		if( a > b) System.out.println("MORE");
		if( a < b) System.out.println("LESS");
		else System.out.println("NUMBERS ARE EQUALS");
	}
}
