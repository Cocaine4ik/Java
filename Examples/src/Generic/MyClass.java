package Generic;

// implement interface Containment through array,
// used for values storage.
// Any class, implemented simple interface
// must be generic too
class MyClass<T> implements Containment<T> {

	T[] arrayRef;
	
	MyClass(T[] o) {
		arrayRef = o;
	}
	
	// implement method contains()
	public boolean contains(T o) {
		for(T x : arrayRef)
			if(x.equals(o)) return true;
		return false;
	}
	
}

