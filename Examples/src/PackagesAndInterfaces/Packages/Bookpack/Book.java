package PackagesAndInterfaces.Packages.Bookpack;

// package work demonstration

public class Book {
	private String title;
	private String author;
	private int pubDate;
	
	// parameterized construct
	Book(String t, String a, int p) {
		title = t;
		author = a;
		pubDate = p;
	}
	
	// show method
	void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
