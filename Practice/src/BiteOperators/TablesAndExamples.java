package BiteOperators;

public class TablesAndExamples {
	
	// Results of implementation of logical byte operators
	//
	// A	B	A | B	A & B	A ^ B	~A
	// 0	0	0		0		0		1
	// 1	0	1		0		1		0
	// 0	1	1		0		1		1
	// 1	1	1		1		0		0
	
	// OR (|)
	
	//   00101010  42
	// | 00001111  15
	// --------------
	//   00101111  47 
	
	// AND (&)	
	
	//   00101010  42
	// & 00001111  15
	// --------------
	//   00001010  47 
	
	// XOR (^)	
	
	//   00101010  42
	// ^ 00001111  15
	// --------------
	//   00100101  47 
	
	// NOT (~)	
	
	//   00101010
	// --------------
	// 	 11010101
}
