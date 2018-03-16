package Easy;

import java.util.Scanner;

// Task: Using input number of the week day week days output his name.
// using operator of the multiple choice "switch". Number of week day Starts from 1 - Monday,  2 — Tuesday and etc.

public class SwitchWeekDay {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		String day;
		int weekday = 7;
				
		System.out.print("Enter number:");
		weekday = in.nextInt();
		
		switch(weekday) {
		case 1: day = "Monday"; break;
		case 2: day = "Tuesday"; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday"; break;
		case 5: day = "Friday"; break;
		case 6: day = "Saturday"; break;
		case 7: day = "Sunday"; break;
		default: day = "Invalid day number!"; break;
		}
		
		System.out.println(day);
	}
}
