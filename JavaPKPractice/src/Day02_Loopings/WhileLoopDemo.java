package Day02_Loopings;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Example 1 - print 1-10 numbers
		
		int i=1;					// initialization
		while(i<=10) {				// condition
			System.out.println(i);	// perform task
			i++;					// increment
		}
		
		System.out.println("");
// Example 2 - print even numbers
		int j=1;
		while (j<=10){
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}
		
		System.out.println("Another method");
		int j1=2;
		while(j1<=10) {
			System.out.println(j1);
			j1+=2;      // incremented by 2 directly
		}
		
		System.out.println("");
//Example 3 = print numbers 10 to 1
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		
		System.out.println("");
//Example 3 = print numbers 10 to 1

	}

}