package PK_YTB_PLAYLIST;

public class ReverseString {
	
	public static String revString(String s) {

		
		if (s.length()<=1) {
			return s;
		}
		String rev = revString(s.substring(1)) + s.charAt(0);
		return rev;
	}

	public static void main(String[] args) {
		
		String s = "Welcome To Java";
		
		System.out.println("Original String : " + s);
		
// Logic 1 : for loop 		
//		String rev = "";
//		for (int i=s.length()-1; i>=0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println("Reversed String : " + rev);
		
		
// Logic 2 : buffer class
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println("Reversed String : " + sb.reverse());

		
// Logic 3: recurssion method
		System.out.println("Reversed String : " + revString(s));
		
		
	}

}
