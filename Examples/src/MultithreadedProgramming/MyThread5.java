package MultithreadedProgramming;

// Suspending, resuming, stopping of thread 

public class MyThread5 implements Runnable {

	Thread thrd;
	
	// if this variable taking a logical value
	// true, this thread executing suspend
	volatile boolean suspended;
	
	// if this variable taking a logical value
	// true, this thread executing stop
	volatile boolean stopped;
	
	MyThread5(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	// thread start point
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int i = 0; i < 100; i++) {
				System.out.print(i + " ");
				if( (i % 10) == 0) {
					System.out.println();
					thrd.sleep(250);
				}
				// For checking conditions of suspending and stopping thread
				// using next synchronized block
				synchronized (this) {
					while(suspended) {
						wait();
					}
					if(stopped) break;
				}
			}
			
		}
		catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}
	
	// stop tread
	synchronized void mystop() {
		stopped = true;
		
		// next operators provide full
		// stopping of the suspend thread
		suspended = false;
		notify();
	}
	// suspend thread
	synchronized void mysuspend() {
		suspended = true;
	}
	synchronized void myresume() {
		suspended = false;
		notify();
	}

}
