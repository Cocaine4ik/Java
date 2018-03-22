package MethodsAndClasses;

// Improved queue class for storage characters values

public class Queue {

	// next members of class is being closed for now
	
	private char q[];
	private int putloc, getloc; // indexes of placement and retrieval elements of queue
	
	Queue(int size) {
		q = new char[size + 1]; // pick memory for queue
		putloc = getloc = 0;
	}
	
	// build a queue from created class queue
	
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		
		q = new char[ob.q.length];
		
		// copy elements in to the queue
		
		for (int i  = getloc + 1; i <= putloc; i++)
			q[i] = ob.q[i];
	}
	
	// build a queue from array of this values
	
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		
		q = new char[a.length + 1];
		
		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}
	
	// put character in queue
	
	void put(char ch) {
		if(putloc == q.length - 1) {
			System.out.println(" - Queue is full.");
				return;
		}
		putloc++;
		q[putloc] = ch;
	}
	char get() {
		if(getloc == putloc)  {
			System.out.println(" - Queue is empty.");
				return (char) 0;
		}
        getloc++;
        return q[getloc];
	}
}
