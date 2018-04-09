package PackagesAndInterfaces.Packages.Bookpackext;

// full package-class name usage demonstration

public class UseBook {
	public static void main(String args[]) {
		
		PackagesAndInterfaces.Packages.Bookpack.Book books [] = 
		new PackagesAndInterfaces.Packages.Bookpack.Book [5];
		
		books[0] = new PackagesAndInterfaces.Packages.Bookpack.Book ("Java: A Beginner's Guide",
                "Schildt", 2011);
		books[1] = new PackagesAndInterfaces.Packages.Bookpack.Book("Java: The Complete Reference",
                "Schildt", 20011);
		books[2] = new PackagesAndInterfaces.Packages.Bookpack.Book("The Art of Java",
                "Schildt and Holmes", 2003);
		books[3] = new PackagesAndInterfaces.Packages.Bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
		books[1] = new PackagesAndInterfaces.Packages.Bookpack.Book("On the Road",
                "Kerouac", 1955);
		
		for(int i = 0; i < books.length; i++) books[i].show();
	}
}
