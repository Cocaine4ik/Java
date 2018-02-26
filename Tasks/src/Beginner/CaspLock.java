package Beginner;

import java.util.Scanner;

// Write a program, which allow user to input in console a Latin letter lower register, 
// transform it to upper register and output the result in a console.

public class CaspLock {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in); // create new scanner and return link for him
		
		for( ; ; ) {
			
			System.out.println("Enter a Latin letter lower register: ");
			System.out.println();
			char letter = in.next().charAt(0);
		}
		
	}
}
