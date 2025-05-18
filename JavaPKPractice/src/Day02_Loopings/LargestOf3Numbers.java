package Day02_Loopings;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=15, b=20, c=30;
		
		if (a>b && a>c) {
			System.out.println(a+" is the largest number");
		}
		else if (b>c && b>a) {
			System.out.println(b+" is the largest number");
		}
		else {
			System.out.println(c+" is the largest number");
		}
		
		int weekno = 5;
		switch(weekno) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monnday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
		}
		
		
		int p=10, q=20;
		System.out.println((p>q? p+" p is largest":q+" q is largest"));
		
		
		
	}

}
