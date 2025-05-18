package Day03_Arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = new int[5];   // syntax ,   5 is size of array
		int[] a2 = new int[5];   // syntax
		
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		a1[4] = 50;
		System.out.println("Third value in a1 array is : "+a1[2]);  // 3rd value i.e. 30
		System.out.println("Just to print whole array a1: "+Arrays.toString(a1)); //[10, 20, 30, 40, 50]
		
		
		int[] a = {10,20,30,40,50,60,70};  // syntax
		
		System.out.println("Length of array a: "+a.length); // 7
		System.out.println("Length of array a1: "+a1.length); // 5
		System.out.println("Length of array a2: "+a2.length);  // 5 --even if the values are not stored, it will return the sixe as 5

		System.out.println("Just to print whole array a: "+Arrays.toString(a));
		
// printing all the values using for loop
		System.out.println("\nprinting all the values using for loop ");
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
System.out.println("\nprinting all the values using for each loop i.e. enhanced for loop ");
		
		for (int x:a) {                    // important concept to remember
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
	}

}
