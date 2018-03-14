package MethodsAndClasses;

public class CallByRef {
	public static void main (String args[]) {
		
		TestRef object = new TestRef(15, 20);
		
		System.out.println("a and b before call: " +  object.a + " " + object.b);
		
		object.change(object);
		
		System.out.println("a and b after call: " +  object.a + " " + object.b);
	}
}
