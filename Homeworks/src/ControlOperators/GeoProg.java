package ControlOperators;

//using loop "for" for geometric progression like 1,2,4,8,16,32

public class GeoProg {
	public static void main(String main[]) {
		int i;
		for(i = 1; i <= 1024; i+=i) {
			System.out.println(i);
		}
	}
}