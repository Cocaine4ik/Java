package Interfaces.qPack;

// class realized fixed size queue
// for storage symbol

public class FixedQueue extends Queue implements ICharQ {
	
	public FixedQueue(int size) {
		super(size);
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

	// reset queue
	public void reset() {
		getloc = putloc = 0;
		System.out.println("Queue was reseted!");
	}

}
