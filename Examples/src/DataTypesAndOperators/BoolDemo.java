package DataTypesAndOperators;

//������������ ��������� � ����������� ����������

public class BoolDemo {
	
	public static void main(String argh[]) {
		
		boolean b;
		b = false;
		System.out.println("b  is " + b);
		
		b = true;
		System.out.println("b  is " + b);
		
		// ���������� �������� ����� ������������ ���
		// ���������� �������� ���������� if.
		
			if(b)
				System.out.println("This is executed");
			
			b = false;
			
			if(b)
				System.out.println("This is not executed");
			
			// ���������� �������� ���������� � ���������� ���������� ��������� ���������.
			
			System.out.println("10 > 9 is " + (10 > 9));
				
			
	}
}
