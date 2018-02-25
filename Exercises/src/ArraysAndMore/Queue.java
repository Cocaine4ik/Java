package ArraysAndMore;
// class which realize the queue for arrays storage
public class Queue {
	
	char q[]; // Array to storage elements in queue	
	int putloc, getloc;
	
	// indexes of placement and extracting  queue elements
	
	Queue(int size) { q = new char[size+1];
	
	// allocate memory for queue
	
	putloc = getloc = 0; }
	
	// put symbol in queue
	
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return; }
		putloc++;
		q[putloc] = ch; }
	
	// extract symbol from the queue
	
	char get() { 
		if(getloc == putloc) { 
			System.out.println(" - Queue is empty."); 
			return (char) 0; } 
		getloc++;
		return q[getloc]; 
		}
}
