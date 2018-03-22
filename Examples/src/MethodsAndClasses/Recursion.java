package MethodsAndClasses;

public class Recursion {
	public static void main(String args[]) {
		
		Factorial f = new Factorial();
		
		System.out.println("Factorial of 3 is " + f.factR(3));
		System.out.println("Factorial of 5 is " + f.factR(5));
		System.out.println("Factorial of 7 is " + f.factR(7));
		
		System.out.println("Factorial of 3 is " + f.factI(3));
		System.out.println("Factorial of 5 is " + f.factI(6));
		System.out.println("Factorial of 7 is " + f.factI(7));
	}
}
