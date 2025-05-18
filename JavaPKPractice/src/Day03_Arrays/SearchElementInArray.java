package Day03_Arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		int search_item = 10;
		boolean status = false;
		for(int x : a){
			if (x==search_item) {
				status = true;
				break;
			}				
		}
		
		if(status == true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}
}
