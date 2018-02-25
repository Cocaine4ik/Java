package ControlOperators;

/* Write the program, which output symbols from the keyboard until, she will meet a point.
 * Provide a counter of spaces. Information about number of spaces must
 *  be output in the end of program. */

public class Spaces {
	public static void main(String argh[]) throws java.io.IOException {
		char ch;
		int spaces = 0;
		System.out.println("Enter a period to stop: ");
		do {
			ch=(char) System.in.read();
			if(ch ==' ') spaces++;			
		}
		while(ch != '.');
			System.out.println("Spaces: " + spaces);
	}
}

