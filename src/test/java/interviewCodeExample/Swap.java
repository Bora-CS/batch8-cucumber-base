package interviewCodeExample;

public class Swap {
	
	public static void main(String[] args) {
		swapInteger(10,25);
		
	}
 
	public static void swapInteger(int a,int b ) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a + b);
	
		
		
	}
}
