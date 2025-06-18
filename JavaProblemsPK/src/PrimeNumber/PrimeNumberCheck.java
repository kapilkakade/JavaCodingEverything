package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	static void checkPrime(int num) {
		int count=0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println(num + " is not a prime number");
		}
		else {
				System.out.println(num + " is a prime number");
		}
		
		
	}

	public static void main(String[] args) {
		
//		System.out.println("Enter a number to check prime : ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println("Given number is : " +num );

// Logic 1: 		
//		int count=0;
//		for (int i=1; i<=num; i++) {
//			if (num%i==0) {
//				count++;
//			}
//		}
//		if(count>2) {
//			System.out.println(num + " is not a prime number");
//		}
//		else {
//			System.out.println(num + " is a prime number");
//		}
		
		
		checkPrime(3);
		
		
		
		
	}
}
