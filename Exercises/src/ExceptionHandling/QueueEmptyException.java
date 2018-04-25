package ExceptionHandling;

import Interfaces.qPack.*;

// exception pointing when queue if empty

public class QueueEmptyException extends Exception{
	public String toString() {
		return "\nQueue is empty.";
	}
}
