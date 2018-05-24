package EnumAutopackAnnotationsStaticimport;

// Here method values() is serving for
// showing list of the constants and values.

enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

public class ShowEnum {
public static void main(String args[]) {
	for ( Tools d : Tools.values())
		System.out.println(d + " has ordinal value of " +  d.ordinal() + "\n");
}
}
