package DataTypesAndOperators;

// ���������� ������ LogicalOpTable - ������ ������ ���������� ��������� trube � false - 1 � 0.

public class NumberOpTable {
	
	public static int toInt(boolean b) {
		return b ? 1 : 0; // ����������� ������� ����������, ���� �� true - �� �������� 1, ���� false ����������� 0.
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
