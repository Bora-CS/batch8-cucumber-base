package interviewCodeExample;

public class FizzBuzz {
	
	public static void main(String[] args) {
		fizzBuzzNumber(100);
		
	}
	
	public static void fizzBuzzNumber(int num) {
		
		
		for(int i = 1; i <=100; i ++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "FizzBuzz number");
			}else if (i % 3 == 0) {
				System.out.println(i + "Fizz number");
			}else if (i % 5 == 0) {
				System.out.println(i + "Buzz number");
			}else {
				System.out.println(i + "is not Fizzbuzz number");
			}
				
		
		}
		
		
	}

}
