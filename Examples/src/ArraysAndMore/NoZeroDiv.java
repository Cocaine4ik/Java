package ArraysAndMore;

// prevention of division on zero by using operator ?

public class NoZeroDiv {
	public static void main(String args[]) {
		
		int result;
		for(int i = -6; i < 5; i++)
		{
			// Division on zero is preventing
			
			result = i != 0 ? 100 / i : 0;
			
			if(i != 0) System.out.println("100 / " + i + " is " + result);
		}
			

			
	}
}
