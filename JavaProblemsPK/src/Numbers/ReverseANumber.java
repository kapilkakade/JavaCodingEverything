package Numbers;

public class ReverseANumber {
	
	public static int rev(int num) {
		int rev = 0;
		while(num>0) {
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		int a = 12345;
		
//		int rev = 0;
//		while(a>0) {
//			int rem = a%10;
//			rev = rev*10 + rem;
//			a = a/10;	
//		}
//		System.out.println(rev);
		
		
		
		
// using	a method	
//		System.out.println("The reverse of "+ a + " is : " + rev(a));
		

// using StringBuffer
		StringBuffer sb = new StringBuffer(String.valueOf(a));
		System.out.println("The reverse of "+ a + " is : " + sb.reverse());
		

	}

}
