package EnumAutopackAnnotationsStaticimport;

// imitation of the automated traffic light

public class TrafficLightSimulator implements Runnable {

	private Thread thrd; // thread for traffic light imitation
	private TrafficLightColor tlc; // Current traffic light color
	boolean stop = false; // stop imitation, if it is true
	boolean changed = false; // change traffic light, if it is true
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}
	// start imitation of the automated traffic light 
	public void run() {
		while(!stop) {
			try {
				Thread.sleep(tlc.getDelay());
			}
			catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	// change light traffic color
	synchronized void changeColor() {
		switch(tlc) {
		case RED:
			tlc = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
		}
		changed = true;
		notify(); // notify about traffic light changing
	}
	// waiting for changing traffic light color
	synchronized void waitForChange() {
		try {
			while(!changed)
				wait(); // wait changing traffic light color
			changed = false;
		}
		catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
	// return current color
	TrafficLightColor getColor() {
		return tlc;
	}
	// stop traffic light imitation
	void cancel() {
		stop = true;
	}
}
