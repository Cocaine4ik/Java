package MultithreadedProgramming;

// Creating a thread by implementing interface Runnable

public class MyThread implements Runnable {
	
	Thread thrd; // in this variable stored link for Thread

	MyThread(String name) {
		thrd = new Thread(this, name); // thread getting name when creating
		thrd.start(); // start executing thread
	}
	
	// Start executing new thread
	public void run() {
		
		// here threads starting executed
		System.out.println(thrd.getName() + " starting");
		try { 
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + " count is " + count );
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrd.getName() + "interrupted");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}
