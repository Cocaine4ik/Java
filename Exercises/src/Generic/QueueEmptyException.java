package Generic;

// exception in connection with errors of queue empty

public class QueueEmptyException extends Exception {
	
	public String toString() {
		return "\nQueue is empty.";
	}
}
