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

import java.util.Scanner;

public class HBDemo {
	public static void main(String args[]) {
		
		// Symbol codes for building DEFAULT home	
		// dash - 45, straight slash - 124, equal - 61
		// left square bracket - 91, right square bracket - 93
		// left brace - 123, right brace - 125
			
		House home = new House(6, 12);
		
		Stuff roof = new Stuff('-', 16);
		Stuff wall = new Stuff('|', 5);
		Stuff lw = new Stuff('[', 7);
		Stuff rw = new Stuff(']', 5);
		Stuff f = new Stuff('2',5);
		Stuff ld = new Stuff('2',5);
		Stuff rd = new Stuff('2',5);
		Stuff md = new Stuff('2',5);
		
		roof.print(roof);
		for(int i = 0; i < wall.getNum(); i++) {
			wall.print();
			for(int j = 0; j < lw.getNum(); j++) {
				lw.print();
				rw.print();
			}
			System.out.println();
		}

	}
}
