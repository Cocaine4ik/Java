package ControlOperators;

/* Coding symbols ASCII of lower register is different from coding symbols of higher register to 32.
 * Consequently, for transformation line letter to capital need to reduce it code to 32.
 * Use this case for writing a program which will enter symbols from keyboard.
 * When result will output this program must transform line letters to capital and capital to line.
 * Else symbols mustn't changed. Program must be ended after use will enter, from keyboard,
 * a "point". In the end make program showed how may symbols is which register was changed.
 */

public class CaseChange {
	public static void main(String argh[]) throws java.io.IOException{
		char ch;
		int changes = 0;
		System.out.println("Enter point to stop.");
		do {
			ch=(char) System.in.read();
			if(ch>='a' & ch<='z') {
				ch-=32; changes++;
				System.out.println(ch);
			}
			else if(ch>='A' & ch<='Z') {
				ch+=32;changes++;
				System.out.println(ch);
			}
		}
		while(ch!='.');
		System.out.println("Case changes:" + changes);
	}
}

