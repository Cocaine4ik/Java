package MultithreadedProgramming;

// thread demonstration

public class UseThreads {
	public static void main(String args[]) {
		
		System.out.println("Main thread starting.");
		
		  // First, build object type MyThread
		MyThread mt = new MyThread("Child #1"); // creating executable object
		
		// form thread from this object
		Thread newThrd = new Thread(mt); // form thread from this object
		
		// and at list, start thread executing
		
		
		
	}
}
