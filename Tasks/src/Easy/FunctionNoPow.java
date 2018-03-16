package Easy;

// calculating z(x, m) = x^m * sin^m(xm)

public class FunctionNoPow {
	
	double Z(double x, int m) {
		double z = 0;
		double number = x;
		double xm = Math.sin((x * m));
		double numberxm = xm;
		for(int i = 1; i < m; i++) {
			number *= x;
			numberxm *= xm;
		}
		if(m == 0) number = 1;
		z = number * numberxm; 
		return z;
	}
}