package HouseBuilding;

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
		// Symbol codes for building DEFAULT home
		
		// dash - 45, straight slash - 124, equal - 61
		// left square bracket - 91, right square bracket - 93
		// left brace - 123, right brace - 125
		
		int roof = 45;// roof
		int wall = 124; // wall
		int lw = 91; // left part of the window
		int rw = 93; // right part of the window
		int foundation = 45; // foundation
		int ld = 123; // left door part
		int rd = 125; // right door part
		int md = 61; // main door part
				
		// create new object House and return link for him
		House home = new House();
		
		// The first part of program. Building default house!
		System.out.print("Building house...");
		home.printSpace();
		
		// printing roof	
		home.printLine(roof);
		
		// printing main part of the house: 2-7 floors
		home.printMain(wall, lw, rw); 
		
		// printing 1 floor
		// printing left wall
		home.printWall(wall);
		
		// printing doors
		home.printDoors(ld, md, rd); 
		
		// printing right wall
		home.printWall(wall); 
		System.out.println();
		
		// printing foundation
		home.printLine(foundation); 
		home.printSpace();
		
		// ************************************************ 
		// The second part of program. Building user house!
		// ************************************************
		
		//greeting new user		
		home.greeting();
		
		// return and assign chosen by user parameters about roof style to variable roof
		roof = home.chooseRoof(roof);
		
		// return and assign chosen by user parameters about wall style to variable wall
		wall = home.chooseWall(wall);
		
		// return and assign chosen by user parameters about left window style to variable lw
		lw = home.chooseWindows(lw);
		
			// return and assign selecting a couple for the left window
			rw = home.windows(lw);
		
		// return and assign chosen by user parameters about left door style to variable ld
		ld = home.chooseDoors(ld);
		
		// return and assign selecting a couple for the right door
		rd = home.doors(ld);
		
		// return and assign chosen by user parameters about foundation style to variable foundation
		foundation = home.chooseFoundation(foundation);
		// printing roof	
				home.printLine(roof);
				
				// printing main part of the house: 2-7 floors
				home.printMain(wall, lw, rw); 
				
				// printing 1 floor
				// printing left wall
				home.printWall(wall);
				
				// printing doors
				home.printDoors(ld, md, rd); 
				
				// printing right wall
				home.printWall(wall); 
				System.out.println();
				
				// printing foundation
				home.printLine(foundation); 
				home.printSpace();
				
				System.out.println("Exellent job! Your house looking great!");
	}
}
