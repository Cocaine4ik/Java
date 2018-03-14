package MethodsAndClasses;

// example, where we can see that here we using simple types which transfer by value
// so with method noChange they will not work like we want

public class CallByValue {
	public static void main(String args[]) {
		
		Test ob = new Test();
		
		int a = 15, b = 20;
		
		System.out.println("a and b before call: " +  a + " " + b);
		
		ob.noChange(a, b);
		
		System.out.println("a and b after call: " +  a + " " + b);		
	}
}
