package PackagesAndInterfaces.Packages.Bookpack;

// package work demonstration

public class Book {
	protected String title;
	protected String author;
	protected int pubDate;
	
	// parameterized construct
	public Book(String t, String a, int p) {
		title = t;
		author = a;
		pubDate = p;
	}
	
	// show method
	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
