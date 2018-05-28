package Generic;

// demonstrate class TwoGen

public class SimpeGen {
	public static void main(String args[]) {
		
		// here like a parameter type T is transferring 
		// type Integer, and like a parameter type V - type String.
		
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
		
		// show on specific types
		tgObj.showTypes();
		
		int v = tgObj.getob1();
		System.out.println("value: " + v);
		
		String str = tgObj.getob2();
		System.out.println("value: " + str);
	}
}
