package EnumAutopackAnnotationsStaticimport;

// Traffic Light demonstration

enum TrafficLightColor {
	RED(12000), GREEN(10000), YELLOW(2000);
	
	private int delay;

	TrafficLightColor (int d) {
		d = delay;
	}
	
	int getDelay() { return delay; }

}

public class TrafficLightDemo {
	public static void main(String args[]) {
		
		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for(int i = 0; i < 9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		t1.cancel();
	}
}
