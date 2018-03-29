package MethodsAndClasses;

import java.util.Scanner;

// string reverse recursion demo

public class StrRevDemo {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		StringReverse s = new StringReverse();
		
		System.out.println("Enter your string: ");
		String str = in.nextLine();
		
		System.out.println("Your string reverse: ");
		s.Reverse(str, str.length() - 1 );
		
		
	}
}
