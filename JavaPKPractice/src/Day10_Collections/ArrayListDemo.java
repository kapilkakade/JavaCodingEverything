package Day10_Collections;
import java.util.*;


/*
 * Collection is an interface 
 * ArrayList is class which is implemented List interface
 * 
 * Heterogeneous data - allowed
 * Insertion order - preserved Index
 * Duplicate element allowed
 * multiple null allowed
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
	
//		// Declaration 1: 
//		ArrayList myList = new ArrayList();
//		
//		// Declaration 2: 
//		List myList2 = new ArrayList();  // ArrayList is child class and it's object myList2 can hold in parent class List.
//		
//		// Declaration 3: To store homogeneous data
//		ArrayList <Integer>myList3 = new ArrayList<Integer>(); // can hold only integer type of data
//		ArrayList <String>myList4 = new ArrayList<String>();  // can hold only String type of data
//		ArrayList <Employee>myList5 = new ArrayList<Employee>(); // can hold only Employee class objects
		
		ArrayList myList = new ArrayList();
		
// Adding data into the arrayList
		myList.add(100);
		myList.add(10.5);
		myList.add("Welcome");
		myList.add('A');
		myList.add(true);
		myList.add(null);
		myList.add(100);
		myList.add(null);
		myList.add("a");
		myList.add("b");
		myList.add("c");
		
		
// To find size of arrayList
		System.out.println("Size of ArrayList : "+myList.size()); // printing size of ArrayList

// To print the arrayList
		System.out.println("Printing data from ArrayList: "+myList ); // [100, 10.5, Welcome, A, true, null, 100, null]
		
// To remove particular element from arrayList
		myList.remove(6);
		System.out.println("After removing 6th element from list: "+myList ); // [100, 10.5, Welcome, A, true, null, null]
		
// To insert an element in an arrayList
	// add() method will add the elements at the last in array
	// but add(2, 'B') method will insert an element wherever we want e.g. at the 2nd index we want to add B
		myList.add(2, 'B');
		System.out.println("After adding an element at 2nd index in the list: "+myList ); // [100, 10.5, B, Welcome, A, true, null, null]
		
// To modify/update an element in the array list
		myList.set(1, 10.6);
		System.out.println("After updating an element at 2nd index in the list: "+myList ); // [100, 10.6, B, Welcome, A, true, null, null]
		
// To access specific element in arrayList
		myList.get(4);
		System.out.println("Trying to access an element in arrayList : "+myList.get(3));  // Welcome
		
// Reading all the data from arrayList : using normal for loop
		System.out.println();
		System.out.println("Reading all the data using for loop:");
		for(int i=0; i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
	
// Reading all the data from arrayList : using enhanced for loop
		System.out.println();
		System.out.println("Reading all the data using enhanced for loop:");
		for(Object x : myList) {
			System.out.println(x);
		}
		
// Reading all the data using iterator method
		System.out.println();
		System.out.println("Reading only first data using iterator method : ");
		
		Iterator it = myList.iterator();  // notice that iterator spelling
		
		System.out.println(it.next()); // it will 
		
		System.out.println();
		System.out.println("Reading all the rest of data using iterator method : ");
		while(it.hasNext()) {				// it.hasNext() will return true and while it is true the loop will continue and print data
			System.out.println(it.next());
		}
		

// To check if arrayList is empty or not
		System.out.println();
		System.out.println("Is arrayLisy empty ? - "+myList.isEmpty());   // False
		
		
// To remove all the elements
		System.out.println();
		ArrayList myList1 = new ArrayList();
		myList1.add("a");
		myList1.add("b");
		myList1.add("c");
		myList1.add("d");
		myList1.add("e");
		System.out.println("Printing new list1: "+myList1);

/////////////////////////////////////////////////      IMP        ////////////////////////////////////////////////////		
// To remove specific elements/multiple element from myList 
		
		System.out.println("Printing myList before removeAll: "+myList); // [100, 10.6, B, Welcome, A, true, null, null, a, b, c]
		myList.removeAll(myList1);
		System.out.println("Printing myList after removeAll: "+myList); // [100, 10.6, B, Welcome, A, true, null, null]
		
		myList1.removeAll(myList1);
		System.out.println("Printing new list1 after removeAll: "+myList1);
		System.out.println("Is arrayList empty ? - "+myList1.isEmpty()); // true
		
		
		
		
// To copy the list in some other ArrayList			
		System.out.println();
		ArrayList al = new ArrayList();
		al.addAll(myList);
		System.out.println("New arrayList : " + al);



	//  To remove all the elements from list
		System.out.println();
		myList.clear();
		System.out.println("Reading data after clear : "+myList );
		System.out.println("Is arrayLisy empty ? - "+myList.isEmpty()); // true
		
		
		
//////////////////////////  SOME COLLECTION METHOD  //////////////////////////////////////
		
		ArrayList am = new ArrayList();
		am.add('A');
		am.add('J');
		am.add('G');
		am.add('T');
		am.add('Z');
		
// Collection sort method to sort an array
		System.out.println();
		Collections.sort(am);
		System.out.println("After sorting an array : " +am ); //After sorting an array : [A, G, J, T, Z]

// sort in reverse order
		System.out.println();
		Collections.sort(am,Collections.reverseOrder());
		System.out.println("After reversing the sort : "+am); //After reversing the sort : [Z, T, J, G, A]
		
// Shuffle the array
		Collections.shuffle(am);
		System.out.println("After shuffling the array : " + am); // After shuffling the array : [J, Z, G, A, T]
		System.out.println();


		
		
		
		
		
		
// Convert an array into an arrayList
		
		String arr[] = {"Dog", "Cat", "Elephant", "Tiger", "Rabbit"};
		
		for (String v : arr) {
			System.out.println(v);
		}
		
//		Dog
//		Cat
//		Elephant
//		Tiger
//		Rabbit	
		
		
		ArrayList arr1 = new ArrayList(Arrays.asList(arr));
		
		System.out.println(arr1);  // [Dog, Cat, Elephant, Tiger, Rabbit]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
