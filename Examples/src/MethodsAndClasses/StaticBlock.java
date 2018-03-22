package MethodsAndClasses;

// static block usage

public class StaticBlock {

	static double rootOf2;
	static double rootOf3;
	
	// this block is running when the class is loading
	
	static {
		System.out.println("Inside static block.");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
		}
	
	StaticBlock(String msg) {
		System.out.println(msg);
	}
	
	
}