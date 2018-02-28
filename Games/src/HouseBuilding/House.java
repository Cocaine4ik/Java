package HouseBuilding;

import java.util.Scanner;

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


public class House {
	public static void main(String args[]) {
		
		// Symbol codes for building DEFAULT home
		
		// dash - 45, straight slash - 124, equal - 61
		// left square bracket - 91, right square bracket - 93
		// left brace - 123, right brace - 125
		
		Scanner in = new Scanner(System.in); // create new scanner and return link for him
		
		int roof = 45; // roof
		int wall = 124; // wall
		int lw = 91; // left part of the window
		int rw = 93; // right part of the window
		int ground = 45; // ground
		int ld = 123; // left door part
		int rd = 125; // right door part
		int md = 61; // main door part
		
		// The first part of program. Building default house!
		
		System.out.print("Building house...");
		System.out.println();
		System.out.println();
		
		//printing roof
		
		for(int i = 0; i < 16; i++) {
			System.out.print((char)roof);
		}
		System.out.println();
		
		// printing 7, 6,5,4,3,2 floors
		
		for(int j = 0; j < 6; j++ ) {
			
			System.out.print((char)wall); // printing left wall
			
			// printing windows per floor
			
			for(int i = 0; i < 7; i++) {
				System.out.print((char)lw);
				System.out.print((char)rw);
			}
			System.out.print((char)wall); // printing right wall
			System.out.println();
		}
		
		// printing 1 floor
		
		System.out.print((char)wall); // printing left wall
		
		// printing doors
		
		System.out.print("     " + (char)ld);
		System.out.print((char)md);
		System.out.print((char)md);
		System.out.print((char)rd + "     ");
		
		System.out.print((char)wall); // printing right wall
		System.out.println();
		
		// printing ground
		
		for(int i = 0; i < 16; i++) {
			System.out.print((char)ground);
		}
		System.out.println();
		System.out.println();
		
		// The second part of program. Building user house!
		
		System.out.println("Now u can build u own house!");
		System.out.println("Let's choose structures to your house.");
		System.out.println();
		
		for( ; ; ) {
			System.out.println("Choose your roof material:");
			System.out.println("Default roof - 45 \t Tile roof - 95 \t Slate roof - 126");
			System.out.println("Enter a number of the choosen material:");
			String roofUser = in.nextLine();
			
			// checking input, if input is empty, warn user about it
			// and ask to try again, after that - continue loop.
							
			if(roofUser.isEmpty()) {
				System.out.println("You don't enter anything.");
				System.out.println();
				continue;
			}
			
			// checking input, if input have any characters, warn user about it
			// and ask to try again, after that - continue loop.
			
			if(!roofUser.matches("[-+]?\\d+")){
				System.out.println("The number must consists only numerals.");
				System.out.println();
				continue;
			}
			
			if (roofUser.equals("45") || roofUser.equals("95") || roofUser.equals("126")) {
				roof = Integer.parseInt(roofUser);
				break;
			}
			else {
				System.out.println("Your enter wrong number. Pls choose the material and "
						+ "use his number.");
				System.out.println();
				continue;
			}
		}
		
		
		
	}
}
