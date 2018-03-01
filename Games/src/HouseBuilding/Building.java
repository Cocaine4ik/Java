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
		user.chooseRoof(in, home.roofUser);
		user.chooseWall(in, home.wallUser);
		home.printLine(home.roofUser);
		home.printMain(home.wallUser, home.lw, home.rw); 
	}
}
