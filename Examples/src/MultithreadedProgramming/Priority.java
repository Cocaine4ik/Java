package MultithreadedProgramming;

// Demonstration threads with different priority

public class Priority implements Runnable {
	int count;
	Thread thrd;
	
	static boolean stop = false;
	static String currentName;
	
    /* Building new thread. Pay attention that 
    construct isn't starting thread executing */
	Priority(String name) {
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}

	// start executing new thread
	public void run() {
		
		System.out.println(thrd.getName() + " starting.");
		
		do {
			count++;
			
			if(currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("In " + currentName);
			}
			// first thread which will achieve value 10000000
			// will end else threads
		}
		while (stop == false && count < 10000000);
		stop = true;
		
        System.out.println("\n" + thrd.getName() +
                " terminating.");
		
	}
}
