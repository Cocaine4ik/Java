package Beginner;

import java.util.Scanner;

// create a program which will read entered five-figure number. After that
// each numeral of this number is necessary to output in new string. 

public class DivisionNumberInToDigits {
	public static void main(String args[]) {
		
	Scanner in = new Scanner(System.in); // create new scanner and return link for him
	boolean result = true;
	
			// Endless loop. This will always ask user to enter numbers. 
			// While input is not true for all conditions.
			// If all conditions are right we will output
			// each numeral of input number in new string
	
			for( ; ; ) { 
				System.out.print("Pls enter a five-figure number: ");
				String number = in.nextLine();
				
				// checking if input is empty, if it is true, we give a warning
				// and continue our loop
				
				if(number.isEmpty()) {
					System.out.println("You don't enter anything.");
					System.out.println();// make an empty line 
					continue;
				}
				
				// checking if input isn't have 5 numerals, if it is true, we give a warning
				// and continue our loop
				
				if(number.length() != 5) {
					System.out.println("The number must consists of five numerals.");
					System.out.println();// make an empty line 
					continue;
				}
				
				// checking if input have any characters, if it is true, we give a warning
				// and continue our loop
				
				if(!number.matches("[-+]?\\d+")) {
					System.out.println("The number must consists only numerals.");
					System.out.println();// make an empty line 
					continue;
				}
				
				// If all conditions are right we output each numeral
				// of input number in new string and break endless loop
				
				else
					System.out.println("The first numeral is: " + number.charAt(0));
					System.out.println("The second numeral is: " + number.charAt(1));
					System.out.println("The third numeral is: " + number.charAt(2));
					System.out.println("The fourth numeral is: " + number.charAt(3));
					System.out.println("The fifth numeral is: " + number.charAt(4));
					break;
			}		
	}
}