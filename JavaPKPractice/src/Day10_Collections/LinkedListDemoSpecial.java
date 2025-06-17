package Day10_Collections;
import java.util.*;

public class LinkedListDemoSpecial {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("dog");
		l.add("cat");
		l.add("elephant");
		l.add("horse");
		l.add("dog");
		l.add("pig");
		
		System.out.println(l);  // [dog, cat, elephant, horse, dog, pig]
		
		
		
		l.addFirst("tiger");
		System.out.println("Added element at first: "+l);  // [tiger, dog, cat, elephant, horse, dog, pig]
		l.addLast("lion");
		System.out.println("Added element at last: "+l); // [tiger, dog, cat, elephant, horse, dog, pig, lion]
		
		
		System.out.println("Fetching first element : "+l.getFirst()); // tiger
		
		l.removeLast();
		System.out.println("After removing last element: "+l);  // [tiger, dog, cat, elephant, horse, dog, pig]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
