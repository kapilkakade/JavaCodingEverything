package Palindrome;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check Palindrome: ");
		String s1 = sc.next();
		
		String s = s1;
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
		
		if(s1.equals(rev)) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given string is not a Palindrome");
		}
	}

}
