package DataTypesAndOperators;

//������������ ���������� ��������� � ���������� ����������

public class RelLogOps {
	public static void main(String args[]) {
		
		int i, j;
		boolean bl, b2;
		i = 10;
		j = 11;
		
		if(i < j) System.out.println("i < j"); // ������
		if(i <= j) System.out.println("i <= j"); // ������ ��� �����
		if(i != j) System.out.println("i != j"); // �� �����
		if(i == j) System.out.println("this won't execute"); // �����
		if(i >= j) System.out.println("this won't execute"); // ������ ��� �����
		if(i > j) System.out.println("this won't execute"); // ������
		bl = true;
		b2 = false;
		if(bl & b2) System.out.println("this won't execute"); // �
		if(! (bl & b2)) System.out.println("! (bl & b2) is true"); // �� �
		if(bl | b2) System.out.println("bl | b2 is true"); // ���
		if(bl ^ b2) System.out.println("bl ^ b2 is true"); // ���(�����������)
		
	}
}

