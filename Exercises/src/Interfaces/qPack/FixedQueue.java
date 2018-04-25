package Interfaces.qPack;

import ExceptionHandling.QueueFullException;

// class realized fixed size queue
// for storage symbol

public class FixedQueue extends Queue implements ICharQ {
	
	public FixedQueue(int size) {
		super(size);
	}

	// put symbol to queue
	public void put(char ch) throws QueueFullException {
		if(putloc == q.length-1)
			throw new QueueFullException(q.length - 1);
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
