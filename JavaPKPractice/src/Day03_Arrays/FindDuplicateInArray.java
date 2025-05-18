package Day03_Arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,30,10,10,20,30,40,50,60,30,40};
		
		int num = 10;
		int count=0;
		
		for(int x : a) {
			if(x == num) {
				count++;
			}
		}
		
		System.out.println("The number of times "+num+" is present is: "+count);

	}

}
