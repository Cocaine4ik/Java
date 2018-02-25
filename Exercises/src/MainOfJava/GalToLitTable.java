package MainOfJava;

/* ѕример дл€ опробовани€ 1.2
 * Ёта программа отображает таблицу преобразовани€ галлоны в литры.
 * ѕрисвоить ее исходному файлу им€ GalToLitTable.java. */

public class GalToLitTable {
	
	public static void main(String argh[]) {
		
		double gallons, liters;
		int counter;
		counter = 0; // ѕервоначально в счетчике строк устанавливаетс€ нулевое значение
		
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // преобразовать в литры
			System.out.println(gallons + " gallons is " + liters + " liters.");
			
			// ѕриращение счетчика строк происходит на каждом шаге цикла,
			//а через каждые дес€ть строк выводитс€ пуста€ строка.
			
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
