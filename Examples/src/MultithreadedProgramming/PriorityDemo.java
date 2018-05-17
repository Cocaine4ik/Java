package MultithreadedProgramming;

// demo

public class PriorityDemo {
	public static void main(String args[]) {
		
		Priority mt1 = new Priority("High Pririty");
		Priority mt2 = new Priority ("Low Priority");
		
		// set priority
		// thread mt1 received higher priority, then mt2
		mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
		
		// start thread executing
		mt1.thrd.start();
		mt2.thrd.start();
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("\nHigh priority thread counted to " + mt1.count);
		System.out.println("Low priority thread counted to " + mt2.count);
	}
}
