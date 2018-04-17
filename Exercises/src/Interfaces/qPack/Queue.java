package Interfaces.qPack;

public class Queue {
	
	protected char q[]; // array for storage queue elements
	protected int putloc; // putting and getting element from the storage indexes
	protected int getloc;
	
	// create an empty queue chosen size
	public Queue(int size) {
		q = new char[size + 1]; // pick memory for queue
		putloc = getloc = 0;
	}
}
