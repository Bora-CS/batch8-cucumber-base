package interviewCodeExample;

public class FibonaciiSquence {

	public static void main(String[] args) {
		fibonaciiSquence(10);
	}

	public static void fibonaciiSquence(int number) {

		if (number == 0) {
			System.out.println("Not valid number");
		} else if (number == 1) {
			System.out.println("0");
		}

		int[] fib = new int[number];
		fib[0] = 0;
		fib[1] = 1;

		for (int i = 0; i <= number-2; i++) {
//			fib[i] = fib[i-1] + fib[i-2];
			fib[i+2] = fib[i]+ fib[i+1];
		}
		System.out.println(fib);	
	}

}