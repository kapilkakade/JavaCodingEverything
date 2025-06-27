package PK_YTB_PLAYLIST;
import java.util.*;

public class CountWordsInString {

	public static void main(String[] args) {
		
//		System.out.println("Enter a string: ");
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();	// Welcome To Java Coding
		
		String str = "Welcome To Java Coding";
		
		
		
// Logic 1 : using Array		
//		String[] strArray = str.split(" ");
//		
//		System.out.println(Arrays.toString(strArray));
//		
//		System.out.println(strArray.length);

		
// Logic 2 : 
		
		int count = 1;
		for (int i=0; i<=str.length()-1; i++) {
			
			if ((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
