package Generic;

// Demonstrate generic class

public class GenDemo {
	public static void main(String args[]) {
		// Creating link to object type Gen <Integer>.
		Gen <Integer> iOb;
		
		// Create an object type Gen <Integer> and assign link to
		// his variable iOb. Pay attention to autoboxing with
		// Encapsulation value 88 in object type Integer.
		iOb = new Gen <Integer> (88); // get example type Gen <Integer>
		
		// show on data type, used in object iOb
		iOb.showTypeO();
		
		// Received value in object iOb. Pay attention that
		// casting here is not need
		int v = iOb.getob();
		System.out.println("value: " + v);
		
		System.out.println();
		
		// Creating an object type Gen for the characters lines
		// here is creating a link and the object type Gen <String>
		Gen <String> strOb = new Gen <String> ("Generic test");
		
		// show on data type, used in object strOb
		strOb.showTypeO();
		
		// Getting value from object strOb
		// And here casting is not need
		String str = strOb.getob();
		System.out.println("value: " + str);
	}
}
