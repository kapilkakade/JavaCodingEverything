package Day04_WorkingOnString;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome";
		String rev="";
		
// using for loop	
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		
		
// converting string into character array
		String rev1 ="";
		char s1[] = s.toCharArray();
		System.out.println(Arrays.toString(s1));
		
		for(int i=s1.length-1;i>=0;i--) {
			rev1 = rev1 + s1[i]; 
		}
		System.out.println(rev1);
		
		
// using StringBuffer class
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Using StringBuffer class: "+sb.reverse());

		
// using StringBuilder class
		
		StringBuilder sbb = new StringBuilder(s);
		System.out.println("Using StringBuilder class: "+sbb.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
