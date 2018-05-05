package HouseBuilding;

// Code a program which will build a picture, using symbols from the table ASCII.
// Transform integer to character using java transforming types ability.
// Using System.out.build - u can make something like that
// ----------------
// |[][][][][][][]|
// |[][][][][][][]|
// |[][][][][][][]|
// |[][][][][][][]|
// |[][][][][][][]|
// |     {==}	  |
// ----------------
// To make task more difficult, after first picture, we asking user to try
// build a picture using symbols which he would like to.

import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
		
		// Symbol codes for building DEFAULT home	
		// dash - 45, straight slash - 124, equal - 61
		// left square bracket - 91, right square bracket - 93
		// left brace - 123, right brace - 125
			
		House home = new House (8, 18, '-', '|', '[', ']', '-', '{', '}', '=');
		House home2 = new House();
		
		System.out.println("Buidling default house...\n");
		
		home.build(home.getRoof(), home.getFlat());
		System.out.println();
		
		for(int i = 0; i < home.getFloor(); i++) {
			home.build(home.getWall());
			for(int j = 0; j < home.getFlat()/2-1; j++) {
				home.build(home.getLw());
				home.build(home.getRw());
			}
			home.build(home.getWall());
			System.out.println();		
		}
		
		home.build(home.getWall());
		home.build(home.SPACE, home.getFlat()/3);
		home.build(home.getLd());
		home.build(home.getMd(),2);
		home.build(home.getRd());
		home.build(home.SPACE, home.getFlat()/3);
		home.build(home.getWall());
		System.out.println();
		
		home.build(home.getF(), home.getFlat());
		System.out.println("\n");
		
		System.out.println("Now you can build your own house!");
		System.out.println("Let's choose structures to your house.\n");
	}
}
