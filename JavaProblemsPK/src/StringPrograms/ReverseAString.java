package StringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s = "Welcome To Java";

// Logic 1 : Using for loop
		
		String rev = "";
		for (int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		
// Logic 2 : StringBuffer method
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse().toString());
		
		
// Logic 3 : StringBuilder method
		
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1.reverse().toString());
		
		
		
		
	}
}
