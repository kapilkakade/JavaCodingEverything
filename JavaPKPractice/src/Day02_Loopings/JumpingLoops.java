package Day02_Loopings;

public class JumpingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<=10; i++) {
			
			if(i==5) {
				break;    								// it will only print 1,2,3,4
			}
			System.out.println(i);
		}
		
		System.out.println("");
		
		for(int j=1; j<=10; j++) {
			if(j==5) {
				continue;    						// it will only skip 5 and print other values
			}
			System.out.println(j);
		}
		
		
		System.out.println("");
		
		for(int k=1; k<=10; k++) {
			if(k==1 || k==3 || k==5 || k==7 || k==9) {
				continue;    							// print even numbers
			}
			System.out.println(k);
		}
	}

}
