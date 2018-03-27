package MethodsAndClasses;

// overload method with variable length

public class VarArgs3 {

	// The first variant of the vaTest method
	
	static void vaTest(int...v) {
		System.out.println("vaTest(int...v): " + "Number of args: " + v.length);
		System.out.println("Contetns: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" args " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	// The second variant of the vaTest method
	
	static void vaTest(boolean...v) {
		System.out.println("vaTest(boolean...v): " + "Number of args: " + v.length);
		System.out.println("Contetns: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" args " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	// The third variant of the vaTest method
	
	static void vaTest(String msg, int...v) {
		System.out.println("vaTest(String msg, int...v): " + "Number of args: " + v.length);
		System.out.println("Contetns: ");
		
		for(int i = 0; i < v.length; i++)
			System.out.println(" args " + i + ": " + v[i]);
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		vaTest(1, 2, 3);
		vaTest("Testing: ", 10, 20);
		vaTest(true, false, false);
	}
}
