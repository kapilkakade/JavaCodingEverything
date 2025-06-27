package PK_YTB_PLAYLIST;

import java.util.Scanner;

public class PalindromeStringCheck {

	public static void main(String[] args) {

		System.out.println("Enter a string to check Palindrome : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("Original String : " + a);
		
		StringBuffer sb = new StringBuffer(a);
		
		if (a.equals(sb.reverse().toString())) {
			System.out.println(a + " is Palindrome");
		}
		else {
			System.out.println(a + " is not Palindrome");
		}
		
	}

}
