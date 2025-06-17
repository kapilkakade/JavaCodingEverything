package Day10_1_WrapperClasses;

public class DataConversions {

	public static void main(String[] args) {


		String s1 = "10";
		String s2 = "20";
		
		System.out.println(s1+s2);  // 1020
		
		int s3 = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(s3);  // 30
		
		
		String d1 = "10.5";
		String d2 = "5.5";
		
		double d3 = Double.parseDouble(d1)+Double.parseDouble(d2);
		System.out.println(d3);  //16.0
		
		
		String b1 = "true";
		boolean b2 = Boolean.parseBoolean(b1);
		System.out.println(b2);
		
		
		String c1 = "A";
// String to character is not possible
	
		/////////////////////////////////////   primitive to string   //////////////////////
		
		
		int i = 100;
		String si = String.valueOf(i);
		
		double d = 10.5;
		String sd = String.valueOf(d);
		
		char c4 = 'a';
		String sc = String.valueOf(c4);
		
		
		
		
		int y = 10;
		double z = y;
		System.out.println(z);  //10.0
		
		double d4 = 10.5;
		int f = (int) d4;  // type casting means we are adding cast on double to int
		System.out.println(f);  // 10
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
