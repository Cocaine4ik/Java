package ExceptionHandling;

import Interfaces.qPack.FixedQueue;

// Exercise #9.1
// Adding queue handler to queue class

public class QExcDemo {
	public static void main(String args[]) {
		
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;
		
		try {
			// queue overflow
			for(i = 0; i < 11; i++) {
				System.out.print("Attempting to store: " + 
				(char)('A' + i) );
				q.put((char)('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch(QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		try {
			// try to get character from empty queue
			for(i = 0; i < 11; i++) {
				System.out.print("Getting new char: ");
				ch = q.get();
				System.out.println(ch);
			}
		}
		catch(QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}
