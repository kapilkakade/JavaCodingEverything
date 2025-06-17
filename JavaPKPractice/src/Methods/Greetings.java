package Methods;

public class Greetings {
	
	// No params, No return value
	
	void m1() {
		System.out.println("Hello..");
	}
	
	// No params, return value
	String m2() {
		return("How are you ?");
	}
	

	//	Takes params , no return value
	
	void m3(String name) {
		
		System.out.println("Hello "+name);	
	}
	
	
	// Takes params, returns value
	
	String m4(String name) {
		return("How are you "+name);
	}
	
}
