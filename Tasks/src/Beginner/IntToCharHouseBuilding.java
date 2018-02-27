package Beginner;

// Code a program which will print a picture, using symbols from the table ASCII.
// Transform integer to character using java transforming types ability.
// Using System.out.print - u can make something like that
// ----------------
// |[][][][][][][]|
// |[][][][][][][]|
// |[][][][][][][]|
// |[][][][][][][]|
// |[][][][][][][]|
// |     {==}	  |
// ----------------
// To make task more difficult, after first picture, we asking user to try
// print a picture using symbols which he would like to.


public class IntToCharHouseBuilding {
	public static void main(String args[]) {
		
		// Symbol codes for building DEFAULT home
		
		// dash - 45, straight slash - 124, equal - 61
		// left square bracket - 91, right square bracket - 93
		// left brace - 123, right brace - 125
		
		int roof = 45; // roof
		int wall = 124; // wall
		int lw = 91; // left part of the window
		int rw = 93; // right part of the window
		int ground = 45;
		int ld = 45;
		
		for(int i = 0; i < 16; i++) {
			System.out.print((char)roof);
		}
		System.out.println();
		
		for(int j = 0; j < 5; j++ ) {
			
			System.out.print((char)wall);
			for(int i = 0; i < 7; i++) {
				System.out.print((char)lw);
				System.out.print((char)rw);
			}
			System.out.print((char)wall);
			System.out.println();
		}
		System.out.print((char)wall);
		System.out.print("      ");
		
		for(int i = 0; i < 16; i++) {
			System.out.print((char)ground);
		}
		System.out.println();

		
		
	}
}
