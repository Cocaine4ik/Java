package Beginner;

import java.util.Scanner;

// Write a program, which allow user to input in console a Latin letter lower register, 
// transform it to upper register and output the result in a console.

public class CaspLock {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in); // create new scanner and return link for him
		
		for( ; ; ) { // endless loop, that we use to warn user and make some checks.
			
			System.out.println("Enter a Latin letter lower register: ");
			System.out.println();
			String input = in.nextLine();
			
			// checking input, if input is empty, warn user about it
			// and ask to try again, after that - continue loop.
			
			if(input.isEmpty()) {
				System.out.println("You don't enter anything.");
				continue;
			}
			// checking letter length, if length is more then one character, warn user
			// about it and ask to try again, after that - continue loop.
			
			if(input.length() > 1) {
				System.out.println("U must enter only one letter. Try again. ");
				continue;
			}
			
			// checking input, if input is not a small letter, warn user about it
			// and ask to try again, after that - continue loop.
						
			if (input.charAt(0) < 97 || input.charAt(0) > 122 ) {
				System.out.println("The character which u entered is not a small letter."
				+ " Try again. ");
				continue;
			}
						
			// Using Unicode ASCII we know that upper register letter code is 32
			// more then small letter code. Using this we can transform lower register letter
			// to upper register
			
			else {
				char letter = input.charAt(0); // write first letter from the input to char letter
				letter -=32; // transform letter in upper register
				System.out.println("Your letter in upper register: " + letter + ".");
				break;
			}		
		}		
	}
}
