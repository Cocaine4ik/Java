package DataTypesAndOperators;

public class PromDemo {
	
	public static void main(String argh[]) {
		
		byte b;
		int i;
		b = 10;
		
		// � ������ ������ ���������� ����� �� ���������, ��� ���
		// ��������� ���������� ��������� ��� ��������� � ���� int.
		
		i = b * b;
		b = 10;
		
		// � � ���� ������ ���������� ����� ��������� ��� 
		// ������������ �������� int ���������� ���� byte!
		
		b = (byte)(b*b); // cast needed!!
		System.out.println("a and b: " + i + " " +b);
	}

}
