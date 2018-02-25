package ControlOperators;

//Демонстрация цикла do-while

public class DWDemo {
	public static void main(String argh[]) throws java.io.IOException {
		char ch;
		char a ='p';
		do {
			System.out.println("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // вывести символ с клавиатуры
		}
		while(ch != 'q');
	}
}

