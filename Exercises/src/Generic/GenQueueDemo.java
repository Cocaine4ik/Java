package Generic;

// Project 13.1
// Generic queue demo

public class GenQueueDemo {
public static void main(String args[]) {
	
	// create a queue to storage integer number
	Integer iStore[] = new Integer[10];
	GenQueue<Integer> q = new GenQueue<Integer>(iStore);
	
	Integer iVal;
	System.out.println("Demonstrate a queue of integers");
	try {
		for(int i = 0; i < 5; i++) {
			System.out.println("Adding " + i + " to the q.");
			q.put(i); // put integer value to queue q
		}
	}
	catch (QueueFullException exc) {
		System.out.println(exc);
	}
	
	System.out.println();
	
	try {
		for(int i = 0; i < 5; i++) {
			System.out.println("Getting next Integer from q: ");
			iVal = q.get();
			System.out.println(iVal);
		}
	}
	catch (QueueEmptyException exc) {
		System.out.println(exc);
	}
	
	System.out.println();
	
	Double dStore[] = new Double[10];
	GenQueue<Double> q2 = new GenQueue<Double>(dStore);
	
	Double dVal;
	System.out.println("Demonstrate a queue of doubles");
	try {
		for(int i = 0; i < 5; i++) {
			System.out.println("Adding " + i + " to the q.");
			q2.put((double)i/2); // put double value to queue q
		}
	}
	catch (QueueFullException exc) {
		System.out.println(exc);
	}
	
	System.out.println();
	
	try {
		for(int i = 0; i < 5; i++) {
			System.out.println("Getting next double from q: ");
			dVal = q2.get();
			System.out.println(dVal);
		}
	}
	catch (QueueEmptyException exc) {
		System.out.println(exc);
	}
	
	System.out.println();
}
}
