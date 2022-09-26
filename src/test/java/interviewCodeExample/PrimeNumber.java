package interviewCodeExample;

public class PrimeNumber {

	public static void main(String[] args) {
		checkPrimeNumber(17);
	}

	public static boolean checkPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}

		}

		System.out.println("This is prime number" + number);
		return true;
	}

}
