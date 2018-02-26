package Beginner;

import java.util.Scanner;

// program must transform number in meters, which was entered
// from the keyboard, to number in kilometers

public class MToKm {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in); // create new scanner and return link for him
		
		System.out.println("<<Transformg number from meters to kilometers>>");
		System.out.println();
		
		for( ; ; ) {
			System.out.println("Enter number of meters: ");
			String input = in.nextLine();
			
		// checking input, if input is empty, warn user about it
		// and ask to try again, after that - continue loop.
						
		if(input.isEmpty()) {
			System.out.println("You don't enter anything.");
			continue;
		}
		
		// checking input, if input have any characters, warn user about it
		// and ask to try again, after that - continue loop.
		
		if(!input.matches("[-+]?\\d+")){
			System.out.println("The number must consists only numerals.");
			continue;
		}
		else {
			
			// transform input to integer and write in double variable
			
			double m = Integer.parseInt(input); 
			
			// transform meters to kilometers because we know that 1 km = 1000m
			
			double km = m / 1000;
			
			// output the result. To make result easy for watching
			// we transform double m to integer
			
			System.out.println((int)m + " meters are " + km + " kylometers");
			break;
		}		
		}
	}
}
