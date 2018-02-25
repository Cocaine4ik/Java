package ArraysAndMore;

public class Ragged {
	public static void main(String args[]) {
		
		int riders[][] = new int[7][];		
		// for the first 5 elements of massive length is 10		
		riders[0] = new int [10];
		riders[1] = new int [10];
		riders[2] = new int [10];
		riders[3] = new int [10];
		riders[4] = new int [10];		
		// for other 2 elements of massive length is 2	
		riders[5] = new int [2];
		riders[6] = new int [2];		
		
		// create random data			
		int i,j;
		for(i = 0; i < 5; i++)
			for( j = 0; j < 10; j++)
				riders[i][j] = i + j + 10;
		
		for(i = 5; i < 7; i++)
			for(j = 0; j < 2; j++)
				riders[i][j] = i + j + 10;
			
		
		System.out.println("Riders per trip during this week:");
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 10; j++)
				System.out.print(riders[i][j] + " ");
				System.out.println();
			}
		
		System.out.println();
		
		System.out.println("Riders per trip on the weekend:");
		for(i = 5; i < 7; i++) {
			for(j = 0; j < 2; j++)
				System.out.print(riders[i][j] + " ");
				System.out.println();
			
		}
	}
}
