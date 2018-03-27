package MethodsAndClasses;

// using arguments of variable length
// with another arguments

public class VarArgs2 {
	
	// here msg - is a simple argument
	// and v - is a variable length argument
	
	static void vaTest (String msg, int ...v) {
		System.out.println(msg + v.length);
		System.out.println("Contents:  ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args) {
		vaTest("One vararg: ", 10);
		vaTest("Three varargs: ", 1, 2, 3);
		vaTest("No varargs: ");
	}
}
