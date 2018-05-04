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

public class HBDemo {
	public static void main(String args[]) {
		
		// Symbol codes for building DEFAULT home	
		// dash - 45, straight slash - 124, equal - 61
		// left square bracket - 91, right square bracket - 93
		// left brace - 123, right brace - 125
			
		House home = new House(10, 16);
		
		Stuff roof = new Stuff('-');
		Stuff wall = new Stuff('|');
		Stuff lw = new Stuff('[');
		Stuff rw = new Stuff(']');
		Stuff f = new Stuff('2');
		Stuff ld = new Stuff('2');
		Stuff rd = new Stuff('2');
		Stuff md = new Stuff('2');
		
		roof.build(home.flat);
		for(int i = 0; i < home.getFloor(); i++) {
			wall.build();
			for(int j = 0; j < home.getFlat()/2-1; j++) {
				lw.build();
				rw.build();
			}
			wall.build();
			System.out.println();		
		}

		
	}
}
