package BitwiseOperations;

// using operation of subordinate exclusioner XOR
// for encode and decode messages 

public class Encode {
	public static void main(String args[]) {
		
		String msg = "This is the test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;
		
		System.out.println("Original message: ");
		System.out.println(msg);
		
		// encode message
		for(int i = 0; i < msg.length(); i++)
			// creating encode message string
			encmsg = encmsg + (char)(msg.charAt(i) ^ key);
		System.out.println("Encoded message: ");
		System.out.println(encmsg);

		// decode message
		for(int i = 0; i < msg.length(); i++)
			// creating decode message string
			decmsg = decmsg + (char)(encmsg.charAt(i) ^ key);
		System.out.println("Decoded message: ");
		System.out.println(decmsg);
			
	}
}
