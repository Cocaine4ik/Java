package MultithreadedProgramming;

// extend class MyThread

public class MyThread2 extends Thread{
	// build new thread
	MyThread2(String name) {
		super(name); // assign name to thread
		start(); // start thread	
	}
	
	// start thread executing
	public void run() {

		// here threads starting executed
		System.out.println(getName() + " starting");
		try { 
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + " count is " + count );
			}
		}
		catch(InterruptedException exc) {
			System.out.println(getName() + "interrupted");
		}
		System.out.println(getName() + " terminating.");
	}
	
	
}
