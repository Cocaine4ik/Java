package EnumAutopackAnnotationsStaticimport;

// Packing and unpacking values manually

public class Wrap {
	public static void main(String args[]) {
		
		// Packing value 100 make manually
		Integer iOb = new Integer(100);
		
		// Unpacking value 100  make manually
		int i = iOb.intValue();
		
		System.out.println(i + " " + iOb); // show value iOb
	}
}
