package ArraysAndMore;

public class StrOps {
	public static void main(String args[]) {
		String str1 = "When it comes to web programming. java is #1.";
		String str2 = new String(str1);
		String str3 = "Java strings are powerfull.";
		int result, idx;
		char ch;
		
		// length() - return length of the symbol string
		System.out.print("Length of str1: " + str1.length());
		System.out.println();
		
		// display string character by a character 
		for(int i = 0; i < str1.length(); i++)
			// charAt(index) - return character which situated in string on position
			// specified by parameter "index"
			System.out.print(str1.charAt(i));
			System.out.println();
			
		// boolean equals() - return logical value true if current string 
		// includes the same sequence like the parameter length()
		if(str1.equals(str2))
			System.out.println("str1 equals str2");
		else 
			System.out.println("str1 not equals str2");
		if(str1.equals(str3))
			System.out.println("str1 equals str3");
		else
			System.out.println("str1 does not equals str3");
		
		// compateTo(String) - return negative value if current string less then
		// (String), zero if both string are equal, and a positive value if current
		// string greater then string
		result = str1.compareTo(str3);
		if(result == 0)
			System.out.println("str1 and str2 are equal");
		else if(result < 0)
			System.out.println("str1 is less then str2");
		else
			System.out.println("str1 is greater then str2");
		
		// indexOf(String) - making in current string searching substring initialize
		// by parameter (String). Return index of the first substring entering (String)
		// or -1, if searching is failed
		str2 = "One Two Three One";
		idx = str2.indexOf("One");
			System.out.println("Index of first occurence of One: " + idx);
			// Occurrence - встречаемость
		
		// lastindexOf(String) - making in current string searching substring initialize
		// by parameter (String). Return index of the last substring entering (String)
		// or -1, if searching is failed
		idx = str2.lastIndexOf("One");
		System.out.println("Index of last occurence of One: " + idx);
		
	}
}
