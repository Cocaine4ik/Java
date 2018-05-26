package MultithreadedProgramming;
// suspend, resume, stop own methods demonstration
public class Suspend {
	public static void main(String args[]) {
		
		MyThread5 obi = new MyThread5("My Thread");
		
		try {
			Thread.sleep(1000); // allow thread to start executing
			
			obi.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			obi.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			obi.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			obi.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);
			
			obi.mysuspend();
			System.out.println("Suspending thread.");
			obi.mystop();			
		}
		catch (InterruptedException exc) {
			System.out.println("Main Thread Interrupted.");
		}
		// wait thread ending
		try {
			obi.thrd.join();
		}
		catch(InterruptedException exc) {
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Main Thread exiting.");
	}
}
