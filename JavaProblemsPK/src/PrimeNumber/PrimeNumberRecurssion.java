package PrimeNumber;
import java.util.*;

public class PrimeNumberRecurssion {
	
	public static boolean CheckPrime(int num, int i) {
		
		if (num<=2) {
			return (num==2);
		}
		if (num%i==0)
			return false;
		if (i * i > num)
			return true;
		
		return CheckPrime(num, i+1);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to check prime : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(CheckPrime(num, 2)) {
			System.out.println(num + " is a prime Number.");
		}
		else {
			System.out.println(num + " is not a prime Number.");
		}
	}

}
