package Arrays;

// multi-dimensional arrays practice

public class MultiArray2 {
	public static void main(String args[]) {
		
	// Let's create constant variable for massive size
	int sizeColumn = 10;
	int sizeLine = 20;
	
	// creating two-dimensional array
	char graph[][] = new char[sizeColumn][sizeLine];
	
	// loop for the first size
	for(int i = 0; i < sizeColumn; i++) {
		// loop for the second size
		for(int j = 0; j < sizeLine; j++) {
			// checking for printing only on 0 line and 0 columns
			if(i == 0 || i == sizeColumn -1 || j == 0 || j == sizeLine -1) {
				graph[i][j] = '#';
			}
			else {
				graph[i][j] = ' ';
			}
		}
	}
	// Now we are outputting characters to the screen
	// loop for the first size is outputting strings
	for(int i = 0; i < sizeColumn; i++) {
		
		// loop for the second size is outputting columns - enter of one string
		for(int j = 0; j < sizeLine; j++) {
			System.out.print(graph[i][j]);
		}
		// move a new line
		System.out.println();
	}
	}
}
