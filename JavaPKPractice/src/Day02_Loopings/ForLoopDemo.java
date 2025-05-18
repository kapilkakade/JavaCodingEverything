package Day02_Loopings;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Example - 1 - print numbers 1 to 10
		
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
// Example 2 = print even numbers from 1 to 10
		
		for (int j=2; j<=10; j+=2) {
			System.out.println(j);
		}
		
		
		System.out.println("");
// Example 3 = print even numbers from 10 to 1
		
		for (int k=10; k>=1; k--) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		
		
		
		
		
		

	}

}
