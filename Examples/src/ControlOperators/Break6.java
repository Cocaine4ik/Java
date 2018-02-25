package ControlOperators;

//–асположение метки меет большое значение

public class Break6 {
	public static void main(String argh[]) {
		int x = 0, y = 0;
		
		// «десь метка находитс€ перед оператором
		
		stop1: for(x = 0; x < 5; x++) {
				for(y = 0; y < 5; y++) {
					if(y == 2) break stop1;
					System.out.println("x and y " + x + " и " + y);
				}
		}
		System.out.println();
		
		// ј здесь метка распологаетс€ непосредественно перед открывающийс€ скобкой
		
		for(x = 0; x < 5; x++) stop2: {
			for(y = 0; y < 5; y++) {
				if (y == 2) break stop2;
				System.out.println("x and y " + x + " и " + y);
			}
		}
	}
}

