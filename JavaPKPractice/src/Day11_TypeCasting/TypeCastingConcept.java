package Day11_TypeCasting;

/*
 * Upcasting / widening- converting value from smaller to larger 
 * int--> long
 * 
 * downcasting / narrowing - converting value from larger to smaller
 * 
 * long--> int
 * 
 * 
 */

public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		long longvalue = a;
		System.out.println(longvalue);  // a
		
		long b = 100000;
		
		int intvalue = (int) b;  
		System.out.println(intvalue); // 100000;  (int) is called type casting

		
		double doublevalue = 10.5;
		float floatvalue = (float) doublevalue;
		System.out.println(floatvalue);  // 10.5
		
		
		
		
		
		
	}

}
