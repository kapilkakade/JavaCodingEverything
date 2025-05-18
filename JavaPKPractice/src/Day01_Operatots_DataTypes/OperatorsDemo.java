package Day01_Operatots_DataTypes;
/*
 * operator is a symbol which will perform an operation.

int a=10;
int b=20;

int c=a+b;

a,b are called operands
+ = operators

Types of operators
----------------
1) Arithmetic operators   + - * / % 
2) Relational/comparison operators  >  >=  <  <=  !=  == 
3) Logical operators   &&   ||  !
4) Increment & Decrement operators  ++  --
5) Assignment   =   +=   -=   *= /=  %=
6) conditional/ternary operator  ?: 

Unary Operators: ++  -- =   +=   -=   *= /=  %=  !
Binary operators: + - * / % >  >=  <  <=  !=  ==  &&   ||
ternary operator:   ?:


x	y	x&&y	x||y	!x	!y
---------------------------------------------
true	true	true	true	false	false	
true	false	false	true		true
false	true	false	true	true
false	false	false	false

 */
public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arithmentic operators
		int a=20, b=10;
		
		System.out.println("Sum of 2 numbers is "+(a+b));
		System.out.println("Subtraction of 2 numbers is "+(a-b));
		System.out.println("Multiplication of 2 numbers is "+(a*b));
		System.out.println("Division of 2 numbers is "+(a/b));
		System.out.println("Module of 2 numbers is "+(a%b));
		
		// Relational operators
		System.out.println("");
		System.out.println("Relational Operators: ");
		System.out.println(a>b); //true
		System.out.println(a<b); // false
		System.out.println(a>=b); // true
		System.out.println(a<=b); // false
		System.out.println(a==b); // false
		System.out.println(a!=b); //true
		
		// Logical operators
		
		boolean x = true;
		boolean y = false;
		System.out.println("");
		System.out.println("Logical Operators :");
		System.out.println("And Operation: "+(x && y));
		System.out.println("OR Operation: "+(x || y));
		System.out.println("NOT Operation: "+(!x));
		System.out.println("NOT Operation : "+(!y));
		System.out.println("");
		
		boolean b1 = 10>20;
		System.out.println(b1);
		
		boolean b2 = 20>10;
		System.out.println(b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		
		
		
		
		// Increment decrement
		
		int p = 10 , q=10, r=10 ;
		System.out.println("Value of P: "+p);
		
		// This is called post-increment
		int ij = p++;
		System.out.println("Value of P after p++ : "+p);	// value of p will be 11
		System.out.println("Value of ij stored p++: "+ij);  // value will be 10 only...  it will not store incremented value
		System.out.println("");
		
		int ik = +q;
		System.out.println("Value of q on +q: "+q);// value will be 10
		System.out.println("Value of ik when assigned +q: "+ik); // value will be 10
		System.out.println("");
		
		// This is called pre-increment
		int ul = ++r;
		System.out.println("Value of r: "+r);// value becomes 11
		System.out.println("Value of ul: "+ul);	// value of ul will be 11
		
		
		
		
		
		
	}

}


















