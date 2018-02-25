package ArraysAndMore;
// use method substring
public class SubStr {
	public static void main(String args[]) {
	String orgstr = "Java makes the Web move.";
	
	// form substring
	// here is creating new string, includes new substring
	
	String substr = orgstr.substring(5, 18);
	System.out.println("orgst: " + orgstr);
	System.out.println("substr: " + substr);
	
	// substring(int start index, int end index) return new string, includes
	// part of calling string. As a result created new string object, includes chosen
	// substring because initial string isn't changing, so the principle of string
	// constancy is observed.
	}

}
