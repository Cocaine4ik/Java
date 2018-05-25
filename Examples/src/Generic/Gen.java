package Generic;

// simple generic class
// Here T - is a type parameter, which changed
// by name of the real type when class object Gen
// is creating

// When we are announcing this class T means generic type 
public class Gen <T> {
	T ob; // announce object type T
	// transfer to construct a link to object type T
	Gen(T o) {
		ob = o;
	}
	
	// return object ob from method
	T getob() {
		return ob;
	}
	// show type T
	void showTypeO() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
