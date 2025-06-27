package PK_YTB_PLAYLIST;

import java.util.Scanner;

public class PalindromeNumberCheck {
	
	public static int reverse(int num) {
		int rev = 0;
		while(num>0) {
			int temp = num%10;
			rev = rev*10 + temp;
			num = num/10;
		}
		
		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Palindrome : ");
		int a = sc.nextInt();
		System.out.println("Original Number : " + a);
		
		int num = a;
		
		int reversed =  reverse(num);
		
		if (reversed ==a) {
			System.out.println(a + " Number is Palindrome");
		}
		else {
			System.out.println(a + " Number is not Palindrome");
		}

	}

}
