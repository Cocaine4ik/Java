package EnumAutopackAnnotationsStaticimport;

// imitation of the automated traffic light

public class TrafficLightSimulator implements Runnable {

	private Thread thrd; // thread for traffic light imitation
	private TrafficLightColor tic; // Current traffic light color
	boolean stop = false; // stop imitation, if it is true
	boolean changed = false; // change traffic light, if it is true
	
	TrafficLightSimulator(TrafficLightColor init) {
		tic = init;
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tic = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}
	// start imitation of the automated traffic light 
	public void run() {
		while(!stop) {
			try {
				switch(tic) {
				case GREEN: 
					Thread.sleep(10000); // green during 10 seconds
					break;
				case YELLOW:
					Thread.sleep(2000); // yellow during 2 seconds
					break;
				case RED:
					Thread.sleep(12000); // red during 12 seconds
					break;
				}
			}
			catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	// change light traffic color
	synchronized void changeColor() {
		switch(tic) {
		case RED:
			tic = TrafficLightColor.GREEN;
			break;
		case YELLOW:
			tic = TrafficLightColor.RED;
			break;
		case GREEN:
			tic = TrafficLightColor.YELLOW;
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
	
}
