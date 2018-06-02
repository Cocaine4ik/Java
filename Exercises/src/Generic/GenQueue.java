package Generic;

// generic class implements fixed size queue

public class GenQueue<T> implements IGenQ<T> {

	private T q[]; // arrays to storage queue elements
	private int putloc, getloc; // indexes to put or get 
								// elements to queue
	
	// build empty queue through current array
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	
	// put element to queue
	public void put(T obj) throws QueueFullException {
		if(putloc == q.length-1)
			throw new QueueFullException(q.length-1);
		putloc++;
		q[putloc] = obj;	
	}

	// get element from queue
	public T get() throws QueueEmptyException {
		if(getloc == putloc)
			throw new QueueEmptyException();
		getloc++;
		return q[getloc];
	}
	
}
