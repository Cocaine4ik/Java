package MethodsAndClasses;

// In this class realizing fault-tolerant array, preventing errors when program is execution.

public class FailSoftArray {

	private int a[]; // link to array
	private int errval; // Value, returning in that case if error will would have finding 
	// in the method get()
	public int length; // variable length is public
	
	// To the construct of this class giving array's size and value which
	// must return method get () if locate an error
	
	public FailSoftArray (int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;		
	}
	
	// return arrays element value by preassigned index
	
	public int get(int index) {
		
	// tracing try to apply out of array border
		
	if(ok(index)) return a[index];
	return errval;
	}
	
	// set value of arrays element by preassigned index
	// if we will have an error return logic value false
	
	public boolean put(int index, int val) {
		// tracing try to apply out of array border
		if(ok(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	
	// return logic value true if index is not go out of border
	
	private boolean ok(int index) {
		if(index >= 0 & index < length) return true;
		return false;
	}
	
}
	
