package ControlOperators;

//���������� ��������� break ��� ������ �� �����

public class BreakDemo {
	
	public static void main(String argh[]) {
		
		int num; num = 100;
		
		// ��������� ���� �� ��� ��� ���� ������� ��������
		// ���������� i ������ �������� ���������� num
		
		for(int i = 0; i < num; i++) {
			if(i*i >= num)break; // ���������� ���� ���� i*i >= 100		
			System.out.println(i + "");
		}
		System.out.println("Loop complete.");
	}
}

