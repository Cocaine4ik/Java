package Recursion;
// ƒано натуральное число n>1. ѕроверьте, €вл€етс€ ли оно простым.
// ѕрограмма должна вывести слово YES, если число простое и NO, если число составное.
// јлгоритм должен иметь сложность O(logn).
// ”казание. ѕон€тно, что задача сама по себе нерекурсивна,
// т.к. проверка числа n на простоту никак не сводитс€ к проверке на простоту меньших чисел.
// ѕоэтому нужно сделать еще один параметр рекурсии: делитель числа,
// и именно по этому параметру и делать рекурсию.

public class IsSimple {

	boolean IsItSimple(int n, int i) {
		
		if (n < 2) return false;
		else if (n == 2) return true;
		else if (n % i == 0) return false;
		else if (i < n / 2) return IsItSimple(n, i + 1);
		else return true;
	}
	public static void main(String args[]) {
		
	}
}
