package ControlOperators;

//���������� ������� � ��������� ����� for.

public class Comma {
	public static void main(String argh[]) {
		
		int i, j; // ��� ���������� ���� ������ ������������ 2 ����������
		
		for (i = 0, j = 10; i < j; i++, j--)
			System.out.println("i and j: " + i + " " + j);
	}
}

