package BitwiseOperations;

// class which will show valuables in binary code

public class ShowBits {
	int numbits;	
	
	// construct of the class ShowBits give us the opportunity to create
	// objects which will show needed value of bits
	
	ShowBits(int n) {
		numbits = n;
	}
	
	void show(long val) {
		long mask = 1;
		
		//move left value to position that we need
		mask <<= numbits - 1;
		int spacer = 0;
		
		for(; mask != 0; mask >>>=0) {
			if((val & mask) != 0)
				System.out.print("1");
			else
				System.out.print("0");
			
			spacer++;
		if((spacer % 8) == 0) {
			System.out.print(" ");
			spacer = 0;
		}
			
		}
		System.out.println();
	}
}
