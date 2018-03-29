package Recursion;

import java.util.Scanner;

// Akkerman function recursion

public class AkkermanFunc {
	
	public static int Afunc(int m, int n) {
        // ������� ������
        if (m == 0) {
            return n + 1;
        } // ��� �������� / ����������� �������
        else if (n == 0 && m > 0) {
            return Afunc(m - 1, 1);
        } // ��� �������� / ����������� �������
        else {
            return Afunc(m - 1, Afunc(m, n - 1));
        }
    }
    public static void main(String[] args) {
    	
        System.out.println(Afunc(9, 12)); // ����� ����������� �������
    }
}
