package ExceptionHandling;

// exception pointing when queue if full

public class QueueFullException extends Exception{
	
	int size;
	
	public QueueFullException(int s) { size = s; }
	
	public String toString() {
		return "\nQueue is full. Maximum size is " + size;
	}
}
