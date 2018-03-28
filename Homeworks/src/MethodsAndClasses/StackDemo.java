package MethodsAndClasses;

import java.util.Scanner;

public class StackDemo {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in); // create link copy for Scanner
		
		System.out.print("Enter stack size: ");
		
		int i; char ch;
		int m = in.nextInt(); // user enter stack length
		Stack st = new Stack(m);
		
		// add characters to stack
		
		for(i = 0; i < m; i++) {
			st.push((char) ('A' + i));
		} 
		
		// print stack
		
		for (i = 0; i < m; i++) {
			ch = st.pop();
			System.out.print(ch);
		}
		
		// show stack top point
		
		System.out.print("TOP is: " + st.readTop());
	}
}
