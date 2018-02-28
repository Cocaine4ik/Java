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


public class Building {
	public static void main(String args[]) {
		
		// create new Scanner and return link for him	
		Scanner in = new Scanner(System.in); 		
		// create new object House and return link for him
		House home = new House();
		Interface user = new Interface();
		
		// The first part of program. Building default house!
		System.out.print("Building house...");
		home.printSpace();
		
		// printing roof	
		home.printLine(home.roof);
		
		// printing main part of the house: 2-7 floors
		home.printMain(home.wall, home.lw, home.rw); 
		
		// printing 1 floor
		// printing left wall
		home.printWall(home.wall);
		
		// printing doors
		home.printDoors(home.ld, home.md, home.rd); 
		
		// printing right wall
		home.printWall(home.wall); 
		System.out.println();
		
		// printing foundation
		home.printLine(home.foundation); 
		home.printSpace();
		
		// ************************************************ 
		// The second part of program. Building user house!
		// ************************************************
		
		//greeting new user
		user.greeting();
		
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
				home.roof = Integer.parseInt(roofUser);
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
