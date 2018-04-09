package PackagesAndInterfaces.Packages.Bookpackext;

// protection access method demonstration

public class ProtectDemo {

	public static void main(String args[] ) {
		
	    ExtBook books[] = new ExtBook[5];
	    books[0] = new ExtBook("Java: A Beginner's Guide",
	                           "Schildt", 2007, "Osborne/McGraw-Hill");
	    books[1] = new ExtBook("Java: The Complete Reference",
	                           "Schildt", 2007, "Osborne/McGraw-Hill");
	    books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003,
	                           "Osborne/McGraw-Hill");
	    books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
	    books[4] = new ExtBook("On the Road",
	                           "Kerouac", 1955, "Viking");

	    for(int i=0; i < books.length; i++) books[i].show();
	    
	    // search books with key word author
	    System.out.println("Showing all books by Shildt.");
	    for(int i = 0; i < books.length; i++) {
	    	if(books[i].getAuthor() == "Shildt")
	    		System.out.println(books[i].getTitle());
	    }
	//  books[0].title = "test title"; // Error: Access denied.
	}
}
