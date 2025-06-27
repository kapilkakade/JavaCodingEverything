package PK_YTB_PLAYLIST;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n1= 0, n2=1; 
		int temp = 0;
		System.out.print(n1 + ", " + n2);
		for (int i=2; i<num; i++) {
			temp = n1 + n2;
			System.out.print( ", " + temp);
			n1 = n2;
			n2 = temp;
		}
		
	}

}
