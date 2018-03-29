package Recursion;

import java.util.Scanner;

// Akkerman function recursion

public class AkkermanFunc {
	
	public static int Afunc(int m, int n) {
        // Базовый случай
        if (m == 0) {
            return n + 1;
        } // Шаг рекурсии / рекурсивное условие
        else if (n == 0 && m > 0) {
            return Afunc(m - 1, 1);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Afunc(m - 1, Afunc(m, n - 1));
        }
    }
    public static void main(String[] args) {
    	
        System.out.println(Afunc(9, 12)); // вызов рекурсивной функции
    }
}
