package DataTypesAndOperators;

public class LtoD {
	public static void main(String args[]) {
		long L; double D;
		L = 100123285L; 
		// Автоматическое преобразование типа long в тип double.
		D = L;
		System.out.println("L and D: " + L + " " + D);
	}
}