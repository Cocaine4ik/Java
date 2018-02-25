package DataTypesAndOperators;

//ƒемонстраци€ операторов отношени€ и логических операторов

public class RelLogOps {
	public static void main(String args[]) {
		
		int i, j;
		boolean bl, b2;
		i = 10;
		j = 11;
		
		if(i < j) System.out.println("i < j"); // меньше
		if(i <= j) System.out.println("i <= j"); // меньше или равно
		if(i != j) System.out.println("i != j"); // не равно
		if(i == j) System.out.println("this won't execute"); // равно
		if(i >= j) System.out.println("this won't execute"); // больше или равно
		if(i > j) System.out.println("this won't execute"); // больше
		bl = true;
		b2 = false;
		if(bl & b2) System.out.println("this won't execute"); // и
		if(! (bl & b2)) System.out.println("! (bl & b2) is true"); // Ќе и
		if(bl | b2) System.out.println("bl | b2 is true"); // или
		if(bl ^ b2) System.out.println("bl ^ b2 is true"); // или(исключающее)
		
	}
}

