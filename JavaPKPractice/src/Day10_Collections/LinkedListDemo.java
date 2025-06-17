package Day10_Collections;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
//		LinkedList <Integer>l1 = new LinkedList<Integer>();
//		LinkedList <String>l2 = new LinkedList<String>();
		
		LinkedList l = new LinkedList();
		
		l.add("Welcome");
		l.add(100);
		l.add(true);
		l.add(10.5);
		l.add('A');
		l.add(false);
		l.add(null);
		l.add(100);
		l.add(null);
		
		System.out.println("The size of LinkedList is: " +l.size());
		System.out.println("The otiginal LinkedList is : " +l);  // [Welcome, 100, true, 10.5, A, false, null, 100, null]
		
// remove 
		l.remove(null); // value
		l.remove(1);  // index
		System.out.println("After removing : "+l); // [Welcome, true, 10.5, A, false, 100, null]

// insert
		l.add(1, 100); // index, value
		System.out.println("After inserting a value : "+l); // [Welcome, 100, true, 10.5, A, false, 100, null]
		
// retrieve
		System.out.println(l.get(0));
		
// update/change
		l.set(0, "Welcome to Java");
		System.out.println(l);
		
//contains
		System.out.println(l.contains(100)); //true
		
// reading data in a LinkedList
// simple for loop		
		System.out.println();
		for (int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}

// for each loop
		System.out.println();
		for (Object x: l) {
			System.out.println(x);
		}
		
	
// using iterator method
		
		System.out.println();
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println();
// remove multiple objects from linkedList
		LinkedList l1 = new LinkedList();
		
		l1.add('X');
		l1.add('A');
		l1.add('B');
		l1.add('D');
		l1.add('H');
		l1.add('K');
		
		System.out.println(l); // [Welcome to Java, 100, true, 10.5, A, false, 100, null]
		l.removeAll(l1);
		System.out.println(l);  // [Welcome to Java, 100, true, 10.5, false, 100, null]  A is removed
		
		
		System.out.println();
// copy all elements in another list
		
		LinkedList l2 = new LinkedList();
		
		l2.addAll(l1);
		System.out.println("Printing l1 list"+l1); 
		System.out.println("Printing l2 list"+l2);
		
		
		
///////////////////////////////  Sorting using collections  ///////////////////

		System.out.println();
		System.out.println("Before sorting : " + l2);  // Before sorting : [X, A, B, D, H, K]
		Collections.sort(l2);
		System.out.println("After sorting : " + l2);  // After sorting : [A, B, D, H, K, X]
		
		Collections.sort(l2.reversed());
//		Collections.sort(l2, Collections.reverseOrder());
		System.out.println("Reversed sorting : " + l2);  // Reversed sorting : [X, K, H, D, B, A]
		
		
// shuffling
		
		Collections.shuffle(l2);
		System.out.println("Shuffled : " + l2); // Shuffled : [A, D, X, K, B, H]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
