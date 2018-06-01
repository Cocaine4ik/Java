package Generic;

// Generic interface of queue


public interface IGenQ<T> {

	// put element to queue
	void put(T ch) throws QueueFullExceptions;
	
	// get element from queue
	T get () throws QueueEmptyException;
}
W