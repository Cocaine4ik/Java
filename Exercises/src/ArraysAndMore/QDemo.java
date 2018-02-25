package ArraysAndMore;

public class QDemo {
	public static void main(String args[]) {
		
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		
		char ch;
		int i;
		
		System.out.println("Using bigQ to store the alphabet.");
		
		// put letters symbols in queue bigQ
		
		for(i = 0; i < 26; i++)
			bigQ.put((char)('A' + i));
		
		// extract letter symbols from queue bigQ and show them
		
		System.out.println("Contents of bigQ: ");
			for(i = 0; i < 26; i++) {
				ch = bigQ.get();
				if(ch!=(char)0)
					System.out.print(ch);
			}
			System.out.println();
		
			System.out.println("Using smallQ to generate errors.");
			
			// using a small queue for error generating
			
			for(i = 0; i < 5; i++) {
				System.out.println("Attempting to store " + (char)('Z'-i));
				smallQ.put((char)('Z'-i));
				System.out.println();
			}
			System.out.println();
			
			// additional errors when addressing to the queue smallQ'
			
			System.out.println("Contetnts of smallQ: ");
				for( i = 0; i < 5; i++) {
					ch = smallQ.get();
					if(ch!=(char)0)
						System.out.print(ch);
				}
	}
}
