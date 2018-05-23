package EnumAutopackAnnotationsStaticimport;

// autoboing and autounboxing in statements

public class AutoBox3 {
	public static void main(String args[]) {
		
		Integer iOb, iOb2;
		int i;
		
		iOb = 99;
		System.out.println("Original value if iOb: " + iOb);
		
		// At the next statement object iOb is 
		// autounboxing, calculating, and result is 
		// autoboxing in object again.
		++iOb;
		System.out.println("After ++iOb " + iOb );
		
		// in the next statement  - object iOb
		// is autounboxing, to the got value is adding
		// number 10, and result is autoboxing in object iOb again.
		iOb += 10;
		System.out.println("After iOb += 10: " + iOb);
		
		// In the next statement object iOb is autounboxing, calculating,
		// and result is autoboxing to object iOb.
		
	}
}
