package ClassesAndMethods;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter u name: ");
		String name = in.nextLine();
		
		System.out.print("Enter u age: ");
		int age = in.nextInt();
		
		System.out.print("U name is " + name + " and u are " + age + " years old.");
	}
}
