package MethodsAndClasses;

// demonstration of the applying to the fault-tolerant array

public class FSDemo {
	public static void main(String args[]) {
		
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x = 0;
		
		// locate hidden fails in applying to array
		
		System.out.println("Fail quietly.");
		
		for(int i = 0; i < (fs.length * 2); i++)
			
			// Access to massive must carry out with help 
			// of special methods
			fs.put(i, i*10);
		
		for(int i = 0; i < (fs.length*2); i++)	{
			// Access to massive must carry out with help 
			// of special methods
			
			x = fs.get(i);
		if(x != -1) System.out.print(x + " ");		
		}
		
		System.out.println();

		// and now handle with fails and output error messages
		System.out.println("\nFail with error reports." );
		for(int i = 0; i < (fs.length * 2); i++)
			if(!fs.put(i, i*10))
				System.out.println("Index of " + i + " is out-of-bounds");
		
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
			else System.out.println("Index " + i + " out-of-bounds");
		}
		
	}
}
