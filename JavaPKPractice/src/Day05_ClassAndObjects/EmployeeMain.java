package Day05_ClassAndObjects;

public class EmployeeMain {

	public static void main(String[] args) {
		
// creating object with reference variable emp1		
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "John";
		emp1.job = "Representative";
		emp1.sal = 50000;
		emp1.display();
		System.out.println();
		
		
// creating object without reference variable
		
	
		new Employee().eid = 102;  // don't forget the () after Employee
		new Employee().ename = "Mike";
		new Employee().job = "Product Owner";
		new Employee().sal = 30000;
		new Employee().display();  // it will print null and 0
		
		// That's the reason we are giving reference variable
		

	}

}
