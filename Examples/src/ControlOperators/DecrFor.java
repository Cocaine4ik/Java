package ControlOperators;

//Цикл for выполняющийся с отрицателльным приращением переменной

public class DecrFor {
	
	public static void main(String argh[]) {
		
		int x; // на каждом шаге цикла управляющиая им переменная уменьшаеться на 5.
		
		for(x = 100; x > -100; x-=5)
			System.out.println(x);
	}
}
