package ArraysAndMore;

// Subordinate NOT demonstration

public class NotDemo {
	public static void main(String args[]) {
		byte b = -34;
		for(int t = 128; t > 0; t = t/2) {
			if((b & t) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		}
		// inverse all bits 
		b = (byte) ~ b;
		System.out.println();
		
		for(int t = 128; t > 0; t = t/2) {
			if((b & t) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
}
