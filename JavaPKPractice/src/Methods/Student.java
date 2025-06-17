package Methods;

public class Student {

	int sid;
	String name;
	char grade;
	
	void printSudentData() {
		System.out.println(sid+" "+name+" "+grade);
	}
	
	void setStudentData(int id, String sname, char gr) {
		
		sid = id;
		name = sname;
		grade = gr;
		
	}
	
	Student(int id, String sname, char gr){
		sid = id;
		name = sname;
		grade = gr;
	}
	
	
	
}
