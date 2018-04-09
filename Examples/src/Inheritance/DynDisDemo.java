package Inheritance;

// Dynamic dispatching methods demonstration
// DEMO

public class DynDisDemo {
	public static void main(String args[]) {
		Sup superOb = new Sup();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();
		
		Sup supRef;
		
        // In each of the bellow calls, a specific option of
        // method who() choosing in time when it is performed
        // an object, in which we have a link/
		
		supRef = superOb;
		supRef.who();
		
		supRef = subOb1;
		supRef.who();
		
		supRef = subOb2;
		supRef.who();
	}
}
