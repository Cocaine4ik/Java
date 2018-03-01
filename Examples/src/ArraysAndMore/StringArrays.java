package ArraysAndMore;
// using arrays character strings
public class StringArrays {
	public static void main(String args[]) {
	//character strings array
	String strs[] = {"This","is","the","test."};
	
	System.out.println("Original array:");
	for(String s:strs)
		System.out.print(s + " ");
		System.out.print("\n");
		
	// change character string
	strs[1] = "Was";
	strs[3] = "test, too";
	
	System.out.println("Modified array:");
	for(String s:strs)
		System.out.print(s + " ");

	}
}
