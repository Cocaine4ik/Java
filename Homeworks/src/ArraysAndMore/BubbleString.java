package ArraysAndMore;

// Bubble sorting logic demonstration
public class BubbleString {
public static void main(String args[]) {
	
	String str[] = {"I", "will", "be", "the", "greatest", "Java", "developer", "ever", "been", "!"};
	int a, b;
	String t;
	int size;
	size = str.length;
	
	// show current massive
	
	System.out.println("Original array is:");
		for(int i = 0; i < size; i++)
			System.out.print(" " + str[i]);
			System.out.println();
			
			//realize logic  of bubble sorting
			
			for(a = 1; a < size; a++)
				for(b = size - 1; b >=a;  b--) {
					if(str[b-1].compareTo(str[b]) > 0) {
						
						// if require order is not observed - change elements places
					t = str[b-1];
					str[b-1] = str[b];
					str[b] = t;
					}
				}
			//show sorted massive
				System.out.println("Sorted array is: ");
					for(int i = 0; i < size; i++)
						System.out.print(" " + str[i]);
						System.out.println();
}
}
