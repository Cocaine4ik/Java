package Interfaces;

// class realized fixed size queue
// for storage symbol

public class FixedQueue implements ICharQ {
	
	private char q[]; // array for storage queue elements
	private int putloc, getloc; // putting and getting element from the storage indexes
	
	// create an empty queue chosen size
	public FixedQueue(int size) {
		q = new char[size + 1]; // pick memory for queue
		putloc = getloc = 0;
	}
	
	// put symbol to queue
	public void put(char ch) {
		if(putloc == q.length-1) {
			System.out.println("Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}

	//get symbol from the queue
	public char get() {
		if(getloc == putloc) {
			System.out.println("Queue is empty.");
			return(char)0;
		}
		getloc++;
		return q[getloc];
	}
}
