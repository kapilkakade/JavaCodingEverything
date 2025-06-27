package PK_YTB_PLAYLIST;
import java.util.*;
import java.util.Map.Entry;

public class CountOccuranceOfCharacterInString {

	public static void main(String[] args) {
		
		String s = "multimillionaire";
		
		s= s.toLowerCase();
		
		char[] charArray = s.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (char c : charArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		
		System.out.println(charMap);
		

		
// If you want only duplicates
		
//		for (char k : charMap.keySet()) {
//			if (charMap.get(k) !=1 ) {
//				System.out.print(k + " : " + charMap.get(k) + ", ");
//			}
//		}


		
	}

}
