package Day02_Loopings;

import java.util.Scanner;

//import java.util.*;
/*control statements
-----------
1) conditional statements
2) Looping/iterative statements
3) jumping statements

conditional statements
---------------------
if
if else
nested if else
if else ladder
switch case


if
-------------
if(condition)
{
statements;
}

if..else
--------
if(condition)
{
statements;
}
else
{
statements;
}

Example1: personAge>=18   eligible for vote
          personAge<18  Not eligible for vote

Example2: Even or odd
		10   even
		5   odd

Example3: check number is positive, negative or zero.
num>0  positive
num<0  negative
num=0   zero

Example4:  largest of 3 numbers
a=10, b=20, c=30

a>b and a>c   -- a is largest
b>a  and b>c   --- b is largest
c>a and c>b   -- c largest

Example 5:  display week names based on week number

switch case syntax
----------------------

switch(variable)
{
case value1:  statements;
		break;
case value2: statements;
		break;
deault: statements;
}

weekname="sunday"

switch(weekname)
{
case "sunday": Syso(1); break;
case "monday": Syso(2); break;
----
-----
}

Assignments
-------------
1) largest of 2 numbers( if..else , ternary operator)
2) smallest of 3 numbers(if..else)
3) print week number based on week name.(Switch case)
 */
public class IFCondition {

	public static void main(String[] args) {
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number to check eligibility : ");
//		
//		int person_age = sc.nextInt();
		int person_age = 20;
		if(person_age>=18) {
			System.out.println("Person is eligible.");
		}
		else if(person_age<=18){
			System.out.println("Person is not eligible.");
		}
		
		int num = 23;
		if(num%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		
		
	}
}



























