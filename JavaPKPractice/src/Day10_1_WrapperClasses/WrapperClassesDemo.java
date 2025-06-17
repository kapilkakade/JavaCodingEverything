package Day10_1_WrapperClasses;


/*
 * Wrapper Classes : The wrapper class converts primitive into object and object into primitive
 * 
 * int     -- Integer
 * float   -- Float
 * double  -- Double
 * char    -- Character
 * boolean -- Boolean 
 * 
 * 
 *  Auto boxing - converting primitive to object type 
 *  unboxing    - object type to primitive type
 */
public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		int i=10;
		double d = 10.5;
		char c = 'A';
		boolean b = true;
		
// Auto boxing		
		Integer iobj = i;
		Double dobj = d;
		Character cobj= c;
		Boolean bobj = b;
				
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		System.out.println();
// unboxing	
		
		int intvalue = iobj;
		double doublevalue = dobj;
		char charactervalue = cobj;
		boolean boolvalue = bobj;
		
		System.out.println(intvalue);
		System.out.println(doublevalue);
		System.out.println(charactervalue);
		System.out.println(boolvalue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
