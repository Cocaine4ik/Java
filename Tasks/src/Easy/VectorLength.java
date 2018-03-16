package Easy;

import java.util.Scanner;

// Write a program, which allow to user to enter in console three vectors
// coordinates x, y, and z, with foundation at the beginning of the coordinates.
// Calculate this vectors length and enter back her to the console.

public class VectorLength {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int x, y, z;
		double a; // vector
		
		System.out.print("Enter x: ");
		x = in.nextInt();
		System.out.print("Enter y: ");
		y = in.nextInt();
		System.out.print("Enter z: ");
		z = in.nextInt();
		
		System.out.println("You have entered next numbers: x = " + x + "; y = " + y + "; z = " + z + ";");
		a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
		System.out.println("Vector Length is : " + a);
	}
}
