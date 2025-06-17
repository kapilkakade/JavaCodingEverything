package Day10_Collections;
import java.util.*;

/*
 * implement set interface
 * 
 * 
 * Heterogeneous data - allowed
 * Insertion order - not preserved Index
 * Duplicate element not allowed
 * multiple null not allowed  / only single null is allowed
 * 
 */

public class HashSetDemo {

	public static void main(String[] args) {
		
//		Set mySet1 = new HashSet();      // declaration 
//		HashSet <String>mySet = new HashSet<String>();
//		HashSet mySet = new HashSet();
		
		HashSet mySet = new HashSet();
		
		mySet.add(100);
		mySet.add(10.5);
		mySet.add("Welcome");
		mySet.add('A');
		mySet.add(true);
		mySet.add(null);
		mySet.add(100);
		mySet.add(null);
		mySet.add("a");
		
		System.out.println("Printing my set: "+mySet); // [null, A, a, 100, 10.5, Welcome, true]
		// it ignored duplicate elements
		
// To know size
		System.out.println("Size of my Set : "+mySet.size());
		
		
// To remove an element
		mySet.remove(10.5);
		System.out.println("Printing my set: "+mySet); // [null, A, a, 100, Welcome, true]
		
// To insert an element at any place using index - not possible
		
// To access an element at nth index - not possible
		
// workaround - convert set into ArrayList and perform action
		
		ArrayList al = new ArrayList(mySet);
		System.out.println("Set converted to ArraayList: "+al); // [null, A, a, 100, Welcome, true]
		System.out.println(al.get(2));
		
		
// Reading data using normal for loop is not possible because there is no indexing
		
// Reading data using enhanced for loop
		System.out.println();
		System.out.println("Reading data using enhanced for loop : ");
		
		for(Object x : mySet) {
			System.out.println(x);
		}
		
// Reading data using iterator method
		System.out.println();
		System.out.println("Reading data using iterator method : ");
		
		Iterator it = mySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println();
		System.out.println(mySet.isEmpty()); // false
		
		mySet.clear();
		
		System.out.println(mySet.isEmpty()); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
