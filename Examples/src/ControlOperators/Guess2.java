package ControlOperators;

//игра в угадывание букв, вторая версия

public class Guess2 {
	public static void main(String argh[]) throws java.io.IOException{
		char ch, answer = 'S';
		System.out.println("I am thinking a letter between A and Z");
		System.out.println("Can u guess it?");
		ch =(char) System.in.read(); // ввести символ с клавиатуры
		if(ch==answer) System.out.println("***RIGHT***");
		else System.out.println("...Sorry, you're wrong");
	}

}