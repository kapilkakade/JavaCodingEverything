package Day10_Collections;

public class ReverseEachWordInString {
	
	public static String reverseString(String str) {
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		return rev;
		
	}

	public static void main(String[] args) {

		String s = "Welcome To Java";
		String temp = "";
		String[] sArray = s.split(" ");

		
		for (String c : sArray) {
			temp = reverseString(c);
			System.out.print(temp + " ");
		}
		
	}

}
