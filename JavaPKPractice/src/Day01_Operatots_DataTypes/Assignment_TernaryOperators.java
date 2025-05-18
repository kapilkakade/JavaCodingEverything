package Day01_Operatots_DataTypes;

public class Assignment_TernaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a = a+5;
		System.out.println(a); //15
		
		a+=5;
		System.out.println(a); //20
		
		
		
		
		
		
		
		//Ternary operators
		int p=100, q=200;
		
		int res=(p>q)?p:q;	// if condition is true, assign first value in res, if false, assign second value to res
		System.out.println(res);	// 200
		
		int age = 2;
		
		String Eligible = (age>=18)? "Eligible" : "Not Eligible";
		System.out.println(Eligible);
			
		
		int x = (1==1)?100:200;
		System.out.println(x);
		
		int y = (1==2)?10:20;
		System.out.println(y);
		
		

	}

}
