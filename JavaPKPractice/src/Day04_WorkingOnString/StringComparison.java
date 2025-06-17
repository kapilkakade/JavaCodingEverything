package Day04_WorkingOnString;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//method 1:
		String a1 = "Welcome";
		String a2 = "Welcome";
		
		System.out.println(a1==a2);			// true
		System.out.println(a1.equals(a2));	// true
		
// method 2:	
		System.out.println();
		String b1 = new String("Welcome");
		String b2 = new String("Welcome");
		
		System.out.println(b1==b2);			// false because it is specifying object value
		System.out.println(b1.equals(b2));	// true
		System.out.println();
		/*
		 *   (==) comparing objects     b1 will be stored in some other object and b2 will be in other object
		 *   equals will compare values
		 */	
		
// method 3:		
		String c1 = "abc";
		String c2 = new String("abc");
		
		System.out.println(c1==c2);			// false
		System.out.println(c1.equals(c2));	// true
		
		String c3 = c2;
		System.out.println(c2==c3);		// true
		System.out.println(c1==c3);  	// false
		System.out.println(c1.equals(c3)); // true
		
		

		
	}

}
