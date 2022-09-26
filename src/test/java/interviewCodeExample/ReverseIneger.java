package interviewCodeExample;

public class ReverseIneger {

	public static void main(String[] args) {
//		reverseInteger("2578");
		reverseInteger_2(257888);
	}
	
	public static void reverseInteger(String  num) {
		String num1 = num + "";
		
		for(int i =num1.length()-1; i>=0;i--) {
			System.out.print(num1.charAt(i));
		}
	}
	
	public static void reverseInteger_2(int number) {
		int result =0;
		for (int i = 0;number>0; i++ ) {
			result = result*10 + number%10;
			number = number/10;
			
		}
		System.out.println(result);
		
	}
	
}
