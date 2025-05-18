package Day03_Arrays;

public class TwoDimentionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[][] = new int[3][2];  // syntax     // 3 represents rows 
		int [][]a2 = new int[3][2];  // syntax     // 2 presents columns
		int []a3[] = new int[3][2];  // syntax    all are correct
		
		
		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;
		
		int b[][] = { {10,20,30}, {40,50,60} };
		
		int c[][] = { {1,2}, {3,4}, {5,6} };
		
		
		System.out.println("Number of rows in a : "+a.length);  		// Number of rows
		System.out.println("Number of columns in a[0] : "+a[0].length); // number of columns
		System.out.println("Number of columns in a[1] : "+a[1].length); // number of columns
		System.out.println(a[1][1]);
		
		
		
		System.out.println("");
// reading from 2D array
		System.out.println("Printing each element in an 2D array");
		for (int i=0; i<a.length; i++) {		// it will loop till how many rows are present in array
			for (int j=0; j<a[i].length; j++) {	// it will loop till how many columns are present in array	
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Printing 2D array Using for each loop");
		
		for(int arr[]:b) {
			for (int x :arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
