package Numbers;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a=10, b=20;
		
		System.out.println("Before swapping : "+ a + "	" + b);
		
// logic 1 : using temp variable
		
//		int temp = a;
//		a=b;
//		b=temp;
//		
//		System.out.println("After swapping using temp variable: "+ a + "  " + b);

		
		
// logic 2 : using + and - , without third variable
		
//		a= a+b;  // a=30
//		b= a-b;  // b=10
//		a= a-b;  // a=20
//		
//		System.out.println("After swapping using temp variable: "+ a + "  " + b);
		
		
// logic 3 : multiplication and division
		
//		a = a*b;  // a=200
//		b = a/b;  // b=10
//		a = a/b;  // a=20
//
//		System.out.println("After swapping using temp variable: "+ a + "  " + b);
		
		
// logic 4 : using XOR (^) operation
		
//		a = a^b;  // 11110
//		b = a^b;  // 10100
//		a = a^b;  // 1010
//		
//		System.out.println("After swapping using temp variable: "+ a + "  " + b);
		
		
// logic 5 : single statement
		
		b = a + b - (a=b);
		
		/*
		 * a=b means    a=20
		 * 
		 * a+b = 30
		 * 
		 * 30-20 = 10
		 * 
		 * b=10
		 * a=20
		 * 
		 * 
		 */
		
		
		System.out.println("After swapping using temp variable: "+ a + "  " + b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
