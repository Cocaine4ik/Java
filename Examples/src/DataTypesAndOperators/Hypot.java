package DataTypesAndOperators;

/* ����������� ����� ����������, ������ �� ����� ������� �� ������� ��������. */

public class Hypot {
	
	public static void main(String argh[]) {
		
		double x, y, z;
		x = 3;
		y = 4;
		
		// �������� �������� �� ����� ������ sqrt(). 
		// ����� ������ ������ ����������� ��� ������, ������ �������� �� ��������.
		
		z = Math.sqrt(x*x+y*y);
		System.out.println("���������� ����� " + z);
	}
}
