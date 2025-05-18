package WorkingOnString;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc,123@xyz";
		
		String[] s1 = s.split(",");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println();
		
		String[] s2 = s1[1].split("@");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println();
		
		
// method to print all of them in one go		
		s = "abc,123@xyz";
		System.out.println(s.split(",")[0]);				//abc
		System.out.println(s.split(",")[1].split("@")[0]);	//123
		System.out.println(s.split(",")[1].split("@")[1]);	//xyz
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
