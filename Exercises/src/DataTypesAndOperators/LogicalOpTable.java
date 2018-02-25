package DataTypesAndOperators;

//Отображение таблицы истинности для логических операторов

/* В этом проекте предстоит создать программу, которая отображает таблицу истинности для логических операторов Java.
* Для удобства восприятия отображаемой информации следует выровнять столбцы таблицы.
* В данном проекте используется ряд языковых средств, рассмотренных ранее в этой главе,
* включая управляющие последовательности и логические операторы, а также демонстрируются отличия в
* предшествовании арифметических и логических операторов. */

//Последовательность действий

public class LogicalOpTable {
	
	/* Для того чтобы обеспечить выравнивание столбцов таблицы,
	 * в каждую выводимую строку следует ввести символы \t.
	 * В качестве примера ниже приведен вызов метода println () для
	 * отображения заголовков таблицы. System.out.println(nP\tQ\tAND\tOR\tXOR\tNOT"); */

	/* Для того чтобы сведения об операторах располагались под соответствующими заголовками,
	 *  в каждую последующую строку таблицы должны быть введены символы табуляции.*/
	
	public static void main(String args[]) {
		boolean p, q;
		System.out.println("MP \t Q \t AND \t OR \t XOR \t NOT");
		
		p = true;
		q = true;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true;
		q = false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false;
		q = true; 
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
				
		p = false;
		q = false;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}
}
