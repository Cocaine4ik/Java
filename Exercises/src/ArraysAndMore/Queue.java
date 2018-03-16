package ArraysAndMore;

// Improved queue class for storage characters values

public class Queue {

	// next members of class is being closed for now
	
	private char q[];
	private int putloc, getloc; // indexes of placement and retrieval elements of queue
	
	Queue(int size) {
		q = new char[size + 1]; // pick memory for queue
		putloc = getloc = 0;
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
