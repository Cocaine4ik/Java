package ArraysAndMore;

// Simple automatic phone direction

public class Phone {
	public static void main(String args[]) {
		String numbers[][] = {
				{ "Tom", "55-5452" },
				{ "Mary", "555-1278" },
				{ "Jon", "555-3312" },
				{ "Rachel", "555-7865" },
		};
		int i;
		
		// for use this program we need to give her 1 element
		//of the command line
		if(args.length !=1 ) System.out.println("Usage: java Phone <name>");
		else {
			for(i = 0; i < numbers.length; i++) {
				if(numbers[i][1].equals(args[0])) {
					System.out.println(x);
				}
			}
		}
	} 
}
