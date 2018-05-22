package EnumAutopackAnnotationsStaticimport;

public class EnumDemo3 {
	public static void main(String args[]) {
		
		Transport tp;
		
		// show airplane speed
		// speed defines by method getSpeed().
		System.out.println("Typical speed for an airplane is " + 
		Transport.AIRPLANE.getSpeed() + " miles per hour.\n");
		
		// show all transport types and their movement speed
		System.out.println("All transport speeds: ");
		for(Transport t : Transport.values())
			System.out.println(t + " typical speed is " + t.getSpeed() + "miles per hour.");
	}
}
