package MultithreadedProgramming;

// Usage methods wait() and notify() for clock imitation

public class TickTock {

	String state; // includes information about clock status
	
	synchronized void tick(boolean running) {
		if(!running) { // stop clock
			state = "ticked";
			notify();
			return;
		}
		
		System.out.print("Tick ");
		
		state = "ticked"; // select current status after "tick"
		notify(); // method tick notify method tock()
		// about executing opportunity
		
		try {
			while(!state.equals("tocked"))
				wait(); // method tick() waits ending method tock()
		}
		catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) { // stop clock
			state = "tocked";
			notify();
			return;
		}
		
		System.out.println("Tock ");
		
		state = "tocked"; // select current status after "tock"
		notify(); // method tock notify method tick() 
		// about executing opportunity
		
		try {
			while(! state.equals("ticked"))
				wait(); // method tock() waits ending method tick()
		}
		catch (InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
	}
}
