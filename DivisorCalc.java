package Week5;

public class DivisorCalc {
	//------------------------------------------------------------------------
	//	Implements Euclid's algorithm for finding the greatest common divisor 
	//  of two positive integers.
	//------------------------------------------------------------------------
	
	public static int gcd(int num1, int num2) {
		if (num2 == 0) {	//case1: (4, 0)
			return num1;
		} else if (num2 <= num1 && num1 % num2 == 0) {	//case2: (4, 4), (4, 2)
			return num2;
		} else if (num2 > num1) {	//case3: (4, 6)
			return gcd(num2, num1);
		} else {	//case4: (6, 4)
			int r = num1 % num2;
			return gcd(num2, r);
		}
		
	}
	
	public static void main(String[] args) {
		// Case 1
		int num1 = 4, num2 = 0, result;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// Case 2.1
		num1 = 4; 
		num2 = 4;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// Case 2.2
		num1 = 4; 
		num2 = 2;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// Case 3
		num1 = 4; 
		num2 = 6;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
		
		// Case 4
		num1 = 6; 
		num2 = 4;
		result = gcd(num1, num2);
		System.out.println("gcd(" + num1 +", " + num2 + ") = " + result);
				
	}
}

//Outputs:
//	gcd(4, 0) = 4
//	gcd(4, 4) = 4
//	gcd(4, 2) = 2
//	gcd(4, 6) = 2
//	gcd(6, 4) = 2


