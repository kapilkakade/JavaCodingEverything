package ArraysPrograms;

import java.util.Arrays;

public class SortingAnArrayUsingForLoop_BubbleSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {8,3,5,9,4,7,2,1,6};
		
		System.out.println("Array before sorting: "+Arrays.toString(a));
		
		int n=a.length;
		
		for (int i=0; i<n-1;i++) {
			for(int j=0; j<n-1;j++) {
				
				if(a[j]>a[j+1]) {
					int c= a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}
			}
		}

		System.out.println("Array after sorting: "+Arrays.toString(a));
	}

}
