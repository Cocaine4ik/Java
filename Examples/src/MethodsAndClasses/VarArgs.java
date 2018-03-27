package MethodsAndClasses;

// demonstration methods with variable length

public class VarArgs {

// Method VaTest() with arguments of variable length
	
	static void vaTest(int ...v) {
		System.out.println("Number of args: " + v.length);
		System.out.println("Contents: ");	
		
	for(int i = 0; i < v.length; i++)
		System.out.println(" arg " + i + ": " + v[i]);
		
		System.out.println();
	}
	public static void main(String args[])
    {
        // Method vaTest()   can be call with variable number of arguments
        vaTest(10); // 1 argument
        vaTest(1, 2, 3); // few argument
        vaTest(); // no arguments
    }
}
