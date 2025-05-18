package Day03_Arrays;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 4 , 5, 20, 80, 46, 84};
		System.out.println("Before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting: "+Arrays.toString(a));
		
		String b[] = {"B", "C", "A", "D", "E"};
		System.out.println("Before sorting: "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting: "+Arrays.toString(b));

	}

}
