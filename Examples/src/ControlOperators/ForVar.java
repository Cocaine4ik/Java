package ControlOperators;

//���������� ���������� � ���������� ������ � ����� ����� for

public class ForVar {
	public static void main(String argh[]) {
		
		int sum = 0;
		int fact = 1;
		
		// ���������� ���������� ����� �� 1 �� 5
		// ���������� ���������� ����������� � ���� ����� for
		
		for(int i = 1; i <= 5; i++) {
			sum+=i;
			
			// ��� �������� �� ���� �����
			
			fact *=i;
		}
		
		// �� ���������� �� ��������� �������
		
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
	}
}

