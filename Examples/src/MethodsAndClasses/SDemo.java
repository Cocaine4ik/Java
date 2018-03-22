package MethodsAndClasses;
 // static demo
public class SDemo {
	public static void main(String args[]) {
		
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		
		// each object have own copy of example's variable
		
		ob1.x = 10;
		ob2.x = 20;
		
		System.out.println("Ofcourse, ob1.x and ob2.y are independent.");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
		System.out.println();
	
		// all objects use one shared by all copy of static variable
		
		System.out.println("The static variable y is shared.");
		StaticDemo.y = 19;
		System.out.println("Set StaticDemo.y to 19.");
		
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		
		StaticDemo.y = 100;
		System.out.println("Change StatucDemo.y to 100.");
		
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		
		
		
	}
}
