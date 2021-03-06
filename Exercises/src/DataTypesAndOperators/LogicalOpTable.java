package DataTypesAndOperators;

//����������� ������� ���������� ��� ���������� ����������

/* � ���� ������� ��������� ������� ���������, ������� ���������� ������� ���������� ��� ���������� ���������� Java.
* ��� �������� ���������� ������������ ���������� ������� ��������� ������� �������.
* � ������ ������� ������������ ��� �������� �������, ������������� ����� � ���� �����,
* ������� ����������� ������������������ � ���������� ���������, � ����� ��������������� ������� �
* ��������������� �������������� � ���������� ����������. */

//������������������ ��������

public class LogicalOpTable {
	
	/* ��� ���� ����� ���������� ������������ �������� �������,
	 * � ������ ��������� ������ ������� ������ ������� \t.
	 * � �������� ������� ���� �������� ����� ������ println () ���
	 * ����������� ���������� �������. System.out.println(nP\tQ\tAND\tOR\tXOR\tNOT"); */

	/* ��� ���� ����� �������� �� ���������� ������������� ��� ���������������� �����������,
	 *  � ������ ����������� ������ ������� ������ ���� ������� ������� ���������.*/
	
	public static void main(String args[]) {
		boolean p, q;
		System.out.println("MP \t Q \t AND \t OR \t XOR \t NOT");
		
		p = true;
		q = true;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true;
		q = false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false;
		q = true; 
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
				
		p = false;
		q = false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}
}
