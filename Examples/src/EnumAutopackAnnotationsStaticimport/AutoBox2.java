package EnumAutopackAnnotationsStaticimport;

// autoboxing and autounboxing when
// method's parameters are sending and values are receiving

public class AutoBox2 {

	// this method is receiving parameter type Ineger.
	static void m(Integer v) {
		System.out.println("m() received " + v);
	}
	
	// this method is returning value type int
	static int m2() {
		return 10;
	}
	
	// this method return value type Integer
	static Integer m3() {
		return 99; // Autoboxing value 99 to object type Integer
	}
	
	public static void main(String args[]) {
		
		// transfer to method m() value type int.
		// Method m() receives parameter type Integer,
		// so value int being autounboxing,
		m(199);
		
		// here object iOb is receiving value type int, returning
		// by method t2(). This value is autounboxing,
		// that his can be set to object iOb.
		Integer iOb = m2();
		System.out.println("Return value from m2() is " + iOb);
		
		// And here method m3() is returning value type Integer, which
		// autounboxing and transforming to type int.
		int i = m3();
		System.out.println("Return value from m3() is " + i);
		
		// Here to method Math.sqrt() like a parameter transfering
		// object iOb, which autounboxing, and his value 
		// going to type double, which need to execute current method
		iOb = 100;
		System.out.println("Square roof of iOb is " + Math.sqrt(iOb));
	}
}
