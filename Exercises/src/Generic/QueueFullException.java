package Generic;

// exception in connection with errors of queue overflow

public class QueueFullException extends Exception {

	int size;
	
	QueueFullException(int s) { s = size; }
	
	public String toString() {
		return "\nQueue is full. Maximum size " +size;
	}
}
