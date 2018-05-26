package MultithreadedProgramming;

// thread demonstration

public class UseThreads {
	public static void main(String args[]) {
		
		System.out.println("Main thread starting.");
		
		  // Now, thread starting after creation
		MyThread mt = new MyThread("Child #1"); // creating executable object
		
		for(int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}
