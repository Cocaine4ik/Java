package ControlOperators;

//чтение символа с калвиатуры

public class KbIn {
	public static void main(String argh[]) throws java.io.IOException{
		
			char ch;
			System.out.println("Press a key followed by ENTER");
			// ввод символа с калвиатуры
			ch = (char) System.in.read();
			// получить значение типа сhar
			System.out.println("Your key is: " + ch);
			
		}
}
