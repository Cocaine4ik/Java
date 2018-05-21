package MultithreadedProgramming;

// Exercise 11.2
// Control main thread

public class UseMain {
	public static void main(String args[]) {
		
		Thread thrd;
		
		// get main thread
		thrd = Thread.currentThread();
		
		// show main thread name
		System.out.println("Main thread is called: " + thrd.getName());
		
		// show main thread priority
		System.out.println("Priority " + thrd.getPriority());
		
		System.out.println();
		
		// set name and priority of the main Thread
		System.out.println("Setting name and priority. \n");
		thrd.setName("Thread #1");
		thrd.setPriority(Thread.NORM_PRIORITY + 3);
		
		System.out.println("Main thread is now called: " + thrd.getName());
		
		System.out.println("Priority is now: " + thrd.getPriority());
	}
}
