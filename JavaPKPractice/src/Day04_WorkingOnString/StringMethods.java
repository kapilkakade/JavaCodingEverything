package Day04_WorkingOnString;

public class StringMethods {

	public static void main(String[] args) {
	
		//String s1 = new String("Hello world");   // another syntax
		
		String s = "Welcome";
		
		int l = s.length();
		System.out.println("Length of string is : "+l);
		
		
		String s1 = "Welcome to ";
		String s2 = "Java Practice";
//		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));		// concat
		
		String s3 = " programming";
		System.out.println(s1.concat(s2).concat(s3));		// concat
		System.out.println();
		
		
		String a1 = "   Welcome   ";
		System.out.println("Length before trimming the string: "+a1.length());
		String a2 = a1.trim();
		System.out.println("Length after trimming the string: "+a2.length());
		
		
// charAt() returns character based on index
		
		System.out.println("Fourth character of "+a2+" is : "+a2.charAt(3));
		System.out.println();
		
// contains
		System.out.println(a2.contains("Wel"));
		System.out.println();
		
// equals() and equalsIgnoreCase() - comparing 2 strings
		
		String p1 = "java";
		String p2 = "java";
		String p3 = "Java";
		
		System.out.println(p1.equals(p2));		// true
		System.out.println(p1.equals(p3));      // false because it will consider cases as well
		System.out.println(p1.equals("java"));	// true
		
		System.out.println(p1.equalsIgnoreCase(p3)); 	// true because it will ignore the cases
		
		
// replace() - replace single character / sequence of character (string) in a string
		
		String a = "Welxome to Python Selenium";
		System.out.println("Before replacing a character: "+a);
		
		// it will not modify existing string
		System.out.println("After replacing a character: "+a.replace('x', 'c')); // replacing a character
		System.out.println("Replace character which does not exists: "+a.replace('q', 'c')); // replacing a character
		
		System.out.println("After replacing a string: "+a.replace("Python", "Java"));	// replacing string
		
		
		System.out.println();
// subString from main string
		System.out.println(a.substring(3,7));
		
		/*
		 * 012345678910 
		 * Wexcome to 
		 */
		
// toUpperCase() and toLowerCase() - converting cases
		String m = "welcome";
		String n = "WELCOME";
		String o = "WeLComE";
		
		System.out.println(m.toUpperCase()); // WELCOME
		System.out.println(n.toLowerCase()); // welcome
		System.out.println(o.toUpperCase()); // WELCOME
		System.out.println(o.toLowerCase()); // welcome
		
		
// split the string into multiple parts based on delimiter
		
		String c1 = "abc@gmail.com";
		
		String arrc1[] = c1.split("@");
		System.out.println(arrc1[0]);
		System.out.println(arrc1[1]);
		
		String c2 = c1.split("@")[0];
		System.out.println(c2);
		
		
// remove $ and replace , with a space from given string
		String abc = "$10,38,48,as,$";
		
		System.out.println(abc.replace("$", "").replace(",", " "));
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
