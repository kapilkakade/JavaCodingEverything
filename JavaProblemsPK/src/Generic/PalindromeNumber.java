package Generic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Palindrome is a number that is revered then also it is same
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num2 = sc.nextInt();
		int num1 = num2;
		int revnum1 = 0;
		int rem;
		
		while(num1>0) {
			rem = num1 % 10;
			revnum1 = revnum1*10 + rem;
			num1 = num1/10;
		}
		System.out.println(revnum1);

		if(num2 == revnum1) {
			System.out.println(num2 + " Given number is a Palindrome");
		}
		else {
			System.out.println(num2 + " Given number is not a Palindrome");
		}
	}

}
