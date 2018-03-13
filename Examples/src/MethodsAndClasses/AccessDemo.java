package MethodsAndClasses;

public class AccessDemo {
	public static void main(String args[]) {
		
		MyClass ob = new MyClass();
		
		// Access to the variable alpha is possible only with
		// help of special created for this target methods.
		
		ob.setAlpha(-99);
		System.out.println("ob.Alpha is: " + ob.getAlpha());
		
		// Apply to the variable alpha how is showing next is impossible.
		// ob.alpha =10;
		// Error! Alpha is private variable
		
		// next applies is possible, because variables
		// beta and gamma are public
		ob.beta = 88;
		ob.gamma  = 10;
	}
}
