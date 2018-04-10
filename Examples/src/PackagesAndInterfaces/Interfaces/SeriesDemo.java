package PackagesAndInterfaces.Interfaces;

// Series demo

public class SeriesDemo {
	public static void main(String args[]) {
		
		ByTwos ob = new ByTwos();
		
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		
		System.out.println("\nResetting");
		ob.reset();
		for(int i = 0; i < 5; i++)
			System.out.println("Next value is " + ob.getNext());
		
		ob.setStart(100);
		for(int i = 0; i < 5; i++) 
			System.out.println("Next value is " + ob.getNext());
	}
}