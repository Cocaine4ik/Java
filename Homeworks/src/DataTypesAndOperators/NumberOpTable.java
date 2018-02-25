package DataTypesAndOperators;

// Аналогично классу LogicalOpTable - только вместо логических выржаений trube и false - 1 и 0.

public class NumberOpTable {
	
	public static int toInt(boolean b) {
		return b ? 1 : 0; // возваращает зачение переменной, если он true - то присвает 1, если false присваевает 0.
	}

	public static void main(String args[]) {
		boolean p, q;
		System.out.println("MP \tQ \tAND \tOR \tXOR \tNOT");
		
		p = true;
		q = true;
		
		System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
		System.out.print(toInt(p&q) + "\t" + toInt(p|q) + "\t");
		System.out.println(toInt(p^q) + "\t" + toInt(!p));
		
		p = true;
		q = false;
		
		System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
		System.out.print(toInt(p&q) + "\t" + toInt(p|q) + "\t");
		System.out.println(toInt(p^q) + "\t" + toInt(!p));
		
		p = false;
		q = true; 
		
		System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
		System.out.print(toInt(p&q) + "\t" + toInt(p|q) + "\t");
		System.out.println(toInt(p^q) + "\t" + toInt(!p));
				
		p = false;
		q = false;
		
		System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
		System.out.print(toInt(p&q) + "\t" + toInt(p|q) + "\t");
		System.out.println(toInt(p^q) + "\t" + toInt(!p));
	}
}
