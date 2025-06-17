package Day10_Collections;

//import java.util.HashMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {
	
	/*
	 * Hashmap is a class implement Map Interface
	 * 
	 * Data can be stored in key-value pair
	 * Key is unique. Values can be duplicated
	 * Insertion order cannot be preserved. i.e. indexing not followed
	 * 
	 */

	public static void main(String[] args) {
		
//		HashMap hm1 = new HashMap();
//		Map hm2 = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101, "John");
		hm.put(102, "Shawn");
		hm.put(103, "Max");
		hm.put(104, "Blair");
		hm.put(105, "Tony");
		hm.put(102, "David");
		
		System.out.println("printing HashMap : "+hm); // {101=John, 102=David, 103=Max, 104=Blair, 105=Tony}
		// it ignored the duplicate key i.e. 102
		// but it replaced value with latest value
		
// To remove
		hm.remove(102);
		System.out.println("printing HashMap after removing 102  : "+hm); //{101=John, 103=Max, 104=Blair, 105=Tony} as a list
		
		
// To access particular element
		System.out.println("Accessing value at 104 key: "+hm.get(104));
		
// To get all the keys and values 
		System.out.println("Accessing all the keys : "+ hm.keySet()); // [101, 103, 104, 105]
		System.out.println("Accessing all the values : "+ hm.values()); // [John, Max, Blair, Tony]
		System.out.println("Accessing all the data : "+ hm.entrySet()); // [101=John, 103=Max, 104=Blair, 105=Tony] as an array
		
		
// for each enhanced for loop
		System.out.println();
		System.out.println("Reading all the data using enhanced for loop : ");
		for (int k : hm.keySet()) {
			System.out.println(k + " " + hm.get(k));
		}
//		101 John
//		103 Max
//		104 Blair
//		105 Tony

// iterator method
		//import java.util.Map.Entry;
		System.out.println();
		System.out.println("Reading all the data using iterator method : ");
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		
		
// clear
		
		System.out.println();
		System.out.println("Is HashSet empty ? - "+ hm.isEmpty()); // false
		hm.clear();
		System.out.println("Is HashSet empty ? - "+ hm.isEmpty()); // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
