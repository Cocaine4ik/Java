package MainOfJava;

/* ������ ��� ����������� 1.2
 * ��� ��������� ���������� ������� �������������� ������� � �����.
 * ��������� �� ��������� ����� ��� GalToLitTable.java. */

public class GalToLitTable {
	
	public static void main(String argh[]) {
		
		double gallons, liters;
		int counter;
		counter = 0; // ������������� � �������� ����� ��������������� ������� ��������
		
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // ������������� � �����
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			// ���������� �������� ����� ���������� �� ������ ���� �����,
			//� ����� ������ ������ ����� ��������� ������ ������.
			
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
