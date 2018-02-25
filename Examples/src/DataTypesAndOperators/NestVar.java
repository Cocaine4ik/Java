package DataTypesAndOperators;

/* ¬ этой программе предпринимаетс€ попытка объ€вить переменную во внутренней области действи€ с таким же именем,
 * как и у переменной, определенной во внешней области действи€.
 * *** Ёта программа не подлежит компил€ции. *** */

public class NestVar {
	public static void main(String argh[]) {
		
		int count; // ѕервое объ€вление переменной count
		
		for(count = 0; count < 10; count = count+1) {
			
			System.out.println("This is count " + count);
			
			// int count; 
			// ¬торое объ€вление переменной count
			// Ќедопустимо, поскольку точно така€ же
			// переменна€ объ€влена раньше!!!
			
			for(count = 0; count < 2; count++)
				System.out.println("This program is in error!");
		}
	}
}