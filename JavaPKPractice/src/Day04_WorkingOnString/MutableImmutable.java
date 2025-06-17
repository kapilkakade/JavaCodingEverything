package Day04_WorkingOnString;

import java.util.Arrays;

public class MutableImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// String is immutable - original value will not change
		String s1 = "Welcome ";
		System.out.println(s1.concat("to Java !")); // Welcome to Java !
		System.out.println(s1);						// Welcome
	
		
//	StringBuffer & StringBuilder are mutable
		
		StringBuffer s2 = new StringBuffer("Welcome ");
		s2.append("to Java !");
		System.out.println(s2);  // Welcome to Java !
		
		
// mutable arrays
		
		int a[] = {10, 20, 30, 40};
		int b[] = a;
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
