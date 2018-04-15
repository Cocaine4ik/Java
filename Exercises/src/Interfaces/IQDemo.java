package Interfaces;

// Demonstration of the three interface ICharQ realizations

public class IQDemo {
	public static void main(String args[]) {
		
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(5);
		CircularQueue q3 = new CircularQueue(10);
		
		ICharQ iQ;
		
		char ch;
		int i;
		
		iQ = q1;
		
		// put fixed size characters row 
		for(i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
		
		// show row includes
		System.out.print("Contents of fixed queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		System.out.println();
		
		iQ = q2;
		
		// put dynamic size characters row 
		for(i = 0; i < 10; i++)
			iQ.put((char) ('Z' - i));
				
		// show row includes
		System.out.print("Contents of dynamic queue: ");
		for(i = 0; i < 10; i++) {
				ch = iQ.get();
				System.out.print(ch);
				}
			
		System.out.println();
		
				iQ = q3;
				
		// put circular size characters row 
		for(i = 0; i < 10; i++)
				iQ.put((char) ('A' + i));
				
		// show row includes
		System.out.print("Contents of circular queue: ");
		for(i = 0; i < 10; i++) {
				ch = iQ.get();
				System.out.print(ch);
				}
		System.out.println();
		
		// put more characters to circular row
		for( i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));
		
		// show row includes
		System.out.print("Contents of circular queue: ");
		for(i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
		 System.out.println("\nStore and consume from" +
                 " circular queue.");
		 
		 // put symbols to the circular queue and get out them
		 
		 for ( i = 0; i < 20; i++) {
			 iQ.put((char)('A' + i));
			 ch = iQ.get();
			 System.out.print(ch);
		 }
		 
	}
}

