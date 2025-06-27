package PK_YTB_PLAYLIST;
import java.util.*;

public class PrimeNumberCheck {
	public static void checkPrime(int num) {
		
		int count=0;
		for (int i=1; i<num; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		if (count<2) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
		
	}


	public static void main(String[] args) {
		
		System.out.println("Enter a number to check Prime : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<2) {
			System.out.println("Number is less than 2 and not prime");
		}
		else {
			checkPrime(num);
		}
		

	}

	
}
