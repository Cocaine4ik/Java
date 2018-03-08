package Arrays;

public class Triangle {
	public static void main(String args[]) {
		int n = 9;

		char triangle[][] = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			int end = (i<n/2)? i: n/2 - i;
			for(int j = 0; j < end; j++) {
				triangle[i][j] = '*';
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(triangle[i][j]);
			}
			System.out.println();
		}
	}
}
