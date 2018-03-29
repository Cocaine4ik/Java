package MethodsAndClasses;

// String reverse recursion

public class StringReverse {
	
	public static void Reverse(String s, int index) {
		
		// base case
		
		if(index == 0) {
			System.out.print(s.charAt(index));
		return;
		}
		
		// recursion step
		
		System.out.print(s.charAt(index));
		Reverse(s,index - 1);
	}
}
