package Day06_ConstrucorDemo;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo(){
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a, int b){
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd1 = new ConstructorDemo();
		cd1.sum();										// 30
		
		ConstructorDemo cd2 = new ConstructorDemo(5, 10);
		cd2.sum();										// 15
	}

}
