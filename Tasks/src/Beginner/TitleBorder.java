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
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		
		String thirst = " Laboratory work ¹ ";
		String second = " Made by: st. gr. ZI-123 ";
		String third = " ";
		String spaces = " ";
		
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
		
		thirst += number + spaces;
		second += group + spaces;
		third += surname + spaces + name + spaces + secondName + spaces;
	}
	
}
