package Interfaces;

// Dynamic queue

public class DynQueue extends Queue implements ICharQ {

	public DynQueue(int size) {
		super(size);
	}

	public void put(char ch) {
		if(putloc == q.length-1) {
			// increase queue size
			char t[] = new char [q.length * 2];
			
			// copy elements to the new queue
			for(int i = 0; i < q.length; i++)
				t[i] = q[i];
			
			q = t;
		}
		putloc++;
		q[putloc] = ch;
	}

	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
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
