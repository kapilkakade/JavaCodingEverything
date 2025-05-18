package Day03_Arrays;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Integer
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Entered number is : "+ a);
		
		
		//Decimal
		System.out.println("Enter a decimal number : ");
		double d = sc.nextDouble();
		System.out.println("Entered number is : "+ d);
		
		
		//String
		System.out.println("Enter a string : ");
		String s = sc.next();
		System.out.println("Entered string is : " + s);
		
		
		// sum of 2 numbers
		System.out.println("Enter 2 numbers to add them: ");
		int p = sc.nextInt();
		int q = sc.nextInt();
		System.out.println("The addition of 2 numbers is : "+(p+q));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
