package EnumAutopackAnnotationsStaticimport;

// Usage integrated methods into enumerations 
// Enumeration of the different types of transport

public class EnumDemo2 {
	public static void main(String args[]) {
		
		Transport tp;
		
		System.out.println("Here are all Transport consants");
		
		// Use method values()
		// Receiving arrays with constants type Transport
		Transport allTransport[] = Transport.values();
		for(Transport t : allTransport)
			System.out.println(t);
		
		System.out.println();
		
		// use to method valueOf()
		// get constant named AIRPLANE
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains: " + tp);
	}
}
