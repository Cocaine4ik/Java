package ExceptionHandling;

// Key word throw usage

import java.io.*;

public class ThrowsDemo {
	
	public static char prompt(String str) throws IOException {
	System.out.print(str + ": ");
	return (char) System.in.read();
	}
	
	public static void main(String args[]) {
		char ch;
		try {
			ch = prompt("Enter a letter");
		}
		catch (IOException exc) {
			System.out.println("I/O exception occurred.");
			ch = 'X';
		}
		System.out.println("You pressed " + ch);
	}
}
