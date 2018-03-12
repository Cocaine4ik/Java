package Beginner;

import java.util.Scanner;

// Write a program which will asking name, surname second name, and number of student's group
// and outputting this data looking like next:

/* ********************************
   * Laboratory work ¹ 1          *
   * Made by: st. gr. ZI-123      *
   * Ivanov Andrew Petrovich      *
   ******************************** */

// Necessary, this program herself must define border length which is need.
// Border length consist of string length. Using loops for u can do it easy.

public class TitleBorder {
	
	// method which will add spaces to the strings and print * for right border
	
	static void Spaces(int a, int max) {
		int counter = max - a;
		for (int i = 0; i < counter; i++)
			System.out.print(" ");
			System.out.print("*");
			System.out.println();
	}
	
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in); // create new Scanner and return link for him	
		
		String thirst = "* Laboratory work ¹ "; // 1st string (default)
		String second = "* Made by: st. gr. "; // 2nd string (default)
		String third = "* "; // 3rd string (default)
		int max = 0; // variable for the max string value
		int counter; // counter for spaces
		
		// User interface to enter data
		System.out.print("Enter student name: ");
		String name = in.nextLine();
		System.out.print("Enter student surname: ");
		String surname = in.nextLine();
		System.out.print("Enter student second name: ");
		String secondName = in.nextLine();
		System.out.print("Enter student group: ");
		String group = in.nextLine();
		System.out.print("Enter laboratory work number: ");
		int number = in.nextInt();
		System.out.println();
		
		//summarize default string and user input data
		
		thirst += number;
		second += group;
		third += surname + " " + name + " " + secondName + " ";
		
		// checking what the string have the maximum length
		
		if (thirst.length() > second.length() && thirst.length() > third.length()) max = thirst.length();
		if (second.length() > thirst.length() && second.length() > third.length()) max = second.length();
		if (third.length() > thirst.length() && third.length() > second.length()) max = third.length();
		
		// print top border
		
		for(int i = 0; i <= max; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		// printing 1st string
		
		System.out.print(thirst); // print 1st string with out spaces
		counter = thirst.length(); // add 1st string length to the counter
		TitleBorder.Spaces(counter, max); // add spaces to the 1st string
		
		// printing 2nd string
		
		System.out.print(second); // print 2nd string with out spaces
		counter = second.length(); // add 2nd string length to the counter
		TitleBorder.Spaces(counter, max); // add spaces to the 2nd string
		
		// printing 3rd string
		
		System.out.print(third); // print 3rd string with out spaces
		counter = third.length(); // add 3rd string length to the counter
		TitleBorder.Spaces(counter, max); // add spaces to the 3rd string
		
		// print border bottom border
		
		for(int i = 0; i <= max; i++) {
			System.out.print("*");
		}
		}
	
}
