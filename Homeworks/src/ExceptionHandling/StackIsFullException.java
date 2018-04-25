package ExceptionHandling;

// stack is full exception

public class StackIsFullException extends Exception {

	int size;
	
	public StackIsFullException(int s) {
		s = size;
	}
	
	public String toString() {
		return "Stack is full. Maximum size is " + size;	
	}
}
