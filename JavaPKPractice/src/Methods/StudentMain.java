package Methods;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st = new Student(103, "Janardhan", 'C');
		
	// constructor called here
		
		st.printSudentData();
		
		
	// Assign data using object reference
		st.sid = 101;
		st.name = "John";
		st.grade = 'A';
		st.printSudentData();
		
		
	// Assign data using user defined method
		
		st.setStudentData(102, "johny", 'B');
		st.printSudentData();
		
		
	// using constructor in Student class
//		Student(int id, String sname, char gr){
//			sid = id;
//			name = sname;
//			grade = gr;
//		}
//		
		
	}

}
