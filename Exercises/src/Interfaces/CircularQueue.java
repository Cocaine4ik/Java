package Interfaces;

// Circular Queue

public class CircularQueue extends Queue implements ICharQ {

	public CircularQueue(int size) {
		super(size);
	}

	public void put(char ch) {
		
		/* Queue being full, if index putloc per unit
        lower the index getloc or if index putloc pointing
        to the end of array, and index getloc - to the beginning. */
		
		if( putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc==0)) ) {
			System.out.println(" - queue if full.");
			return;
		}
		putloc++;
		if(putloc == q.length) putloc = 0; // return to the array beginning
		q[putloc] = ch;
	}

	public char get() {
		if(getloc == putloc ) {
			System.out.println(" - queue is empty.");
			return (char) 0;
		}
		getloc++;
		if(getloc == q.length) getloc = 0; // come back to beginning
		return q[getloc];
	}

	// reset queue
	public void reset() {
		getloc = putloc = 0;
		System.out.println("Queue was reseted!");
	}


}
