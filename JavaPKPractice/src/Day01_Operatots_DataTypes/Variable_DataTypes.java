package Day01_Operatots_DataTypes;

/*Variable is a container which can hold data.
to represent data we need variables.

int x=100
int age=30
float price=150.50
double price=150.50
String name="John"
char grad='A'

Data types
-----------
Data type represents type of data.

1) Premitive

byte, short, int, long -----> number without decimal
float, double ------> decimal number
char   --------> single character (single quote)
boolean   ---> true/false


2) Non-premitive/ Derived /Collections
String
ArrayList
HashMap
HashSet
Object
etc......

DataType	Size			Description
--------------------------------------------------
byte		1 byte			Stores whole numbers from -128 to 127

short		2 bytes	    		Stores whole numbers from -32,768 to 32,767
int		4 bytes			Stores whole numbers from -2,147,483,648 to 2,147,483,647
long		8 bytes			Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

float		4 bytes		   Stores fractional numbers. Sufficient for storing 7 decimal digits
double		8 bytes		   Stores fractional numbers. Sufficient for storing 15 decimal digits

boolean		1 bit		      	Stores true or false values
char		2 bytes			Stores a single character/letter


char ch='ABC';  // invalid
String ch='ABC'    // invalid

String ch='A'     // invalid
String ch="A"     // valid


boolean b=true;   //valid
boolean b="true"   // invalid

String s=true;   // not valid

String s="true";  // valid

 */
public class Variable_DataTypes 
{

	public static void main(String[] args) 
	{
		int a=10;
		
//		System.out.println(a);
		
		int b=20, c=30;		//We can declare multiple variables in a single line as well.
		
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		System.out.println("The value of c is "+c);
		System.out.println("The value of sum is "+(a+b+c)); // observe here I am giving a bracket
		System.out.println("The value of sum is "+a+b+c);	// here, if no bracket is given and value is coming as concatenation
		System.out.println("The value of sum is "+a+" "+b+" "+c);
		System.out.println(a+b+c);
		
		int i= 200;
		long l = 12345678909876L;	// to represent or declare long, we need to use L at the end
		float f = 48.34F;			// literal F is needed to declare float
		double d = 57876543.23456789; // literal not needed
		char ch = 'K';		// single quote is allowed
		
		boolean bool1 = true; // only true or false is allowed for boolean
		boolean bool2 = false;
		
		String st = "Kapil";   // double quotes needed for declaring string
		
		System.out.println("I am an integer "+i);
		System.out.println("I am a long "+l);
		System.out.println("I am a float "+f);
		System.out.println("I am a double "+d);
		System.out.println("I am a character "+ch);
		System.out.println("I am a boolean "+bool1);
		System.out.println("I am a boolean "+bool2);
		System.out.println("I am a string "+st);

	}

}
