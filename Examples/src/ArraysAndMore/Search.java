package ArraysAndMore;
// searching in arrays using loop for type for-each
public class Search {
	public static void main (String args[]) {
		int nums[] = {6,8,3,7,5,6,1,4};
		int val = 5;
		boolean found = false;
//use for each to search valuable val in array
		for(int x:nums) {
			if(x==val) {
				found = true;
				break;
			}
		}
		if(found) System.out.println("Value found!");
		else System.out.println("Value not found!");
	}
}
