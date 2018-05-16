package MultithreadedProgramming;

// Creating a thread by implementing interface Runnable

public class MyThread implements Runnable {

	String thrdName;
	
    // Objects type MyThread execute in own threads, because
    // class MyThread implement interface Runnable.
	MyThread(String name) {
		name = thrdName;
	}
	
	// Point of entry to thread
	public void run() {
		
		// here threads starting executed
		System.out.println(thrdName + "starting.");
		try { 
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + " count is " + count );
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrdName + "interrupted");
		}
		System.out.println(thrdName + " terminating.");
	}
}
