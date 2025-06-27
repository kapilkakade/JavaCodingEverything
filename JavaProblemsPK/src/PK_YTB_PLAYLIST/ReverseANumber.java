package PK_YTB_PLAYLIST;

public class ReverseANumber {
	
	public static int reverseNum(int num , int rev1) {
		
		if (num==0) {													// if condition is needed
			return rev1;
		}
		int reminder = num%10;
		rev1 = rev1*10 + reminder;
		return reverseNum(num/10, rev1);								// remember return reverseNum(num/10, rev1);
	}

	public static void main(String[] args) {


		int a = 12345;
		System.out.println("Original Number : " + a);
		
		
//Logic 1 : while loop
//		
//		int rev = 0;
//		while(a>0) {
//			int rem = a % 10;
//			rev = rev*10 + rem;
//			a = a/10;
//		}
//		System.out.println("Reversed Number : " + rev);
		
		
		
// logic 2 : recurssion method
		
//		System.out.println("Reversed Number : " + reverseNum(a,0));
		
		
// logic 3 : Buffer class
		StringBuffer sb = new StringBuffer(String.valueOf(a));              // String.valueOf(a)
		System.out.println("Reversed Number : " + sb.reverse());
		

	}

}
