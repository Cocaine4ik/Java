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
		
		if(putloc + 1 == getloc | ((putloc == q.length - 1) ))
	}

	@Override
	public char get() {
		// TODO Auto-generated method stub
		return 0;
	}

}
