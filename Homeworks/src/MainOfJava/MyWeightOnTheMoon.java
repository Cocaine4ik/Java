package MainOfJava;

/*���� ������� �� ���� ���������� ����� 17% ������.
 *  �������� ���������, ������� ��������� �� ��� ��� �� ����.*/

public class MyWeightOnTheMoon {
	
	public static void main(String argh[]){
		
		double earth, moon, weight;
		
		earth = 9.80665;
		System.out.println("���� ���������� �� ����� " + earth + "�/� � ��������");
		
		weight = 52.0;
		System.out.println("��� ��� �� ����� " + weight + "��");
		System.out.println();
		
		moon = earth * 0.17;
		System.out.println("���� ���������� �� ���� " + moon + "�/� � ��������");
		
		weight = weight * moon;
		System.out.println("��� ��� �� ���� " + weight + "��");
	}
}

