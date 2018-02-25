package ControlOperators;

//Игра в угадывание букв, четвертая версия

public class Guess4 {
	
	public static void main(String argh[]) throws java.io.IOException {
		
		char ch, ignore, answer = 'S';
		
			do {
				System.out.println("I am thinking of a letter between A and Z.");
				System.out.println("Can u guess it: ");
				
				// Ввести символ с клавиатуры
				
				ch = (char) System.in.read();
				
				// Отвергнуть все остальные символы во входном буфере
				
					do {
						ignore = (char) System.in.read();
					}
						while(ignore != '\n');
						if(ch==answer)System.out.println("***Right***");
						
						else {
							System.out.print("Sorrym you're ");
							
							if(ch<answer) System.out.println("too low");
							
							else System.out.println("too high");
							System.out.println("Try again! \n");
						}
			}
			while(answer !=ch);
	}
}
