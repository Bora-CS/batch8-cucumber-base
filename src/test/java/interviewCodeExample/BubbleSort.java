package interviewCodeExample;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = { 5, 7, 9, 33, 63, 23, 11, 55 };
		sortArrayByBubblesort(numbers);
	}

	public static void sortArrayByBubblesort(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length - i - 1; j++) {
				if (ary[j] > ary[j + 1]);
				int temp = ary[j];
				ary[j + 1] = ary[j];
				ary[j] = temp;
			}
		}
		System.out.println("+ i + " + Arrays.toString(ary));
	}
}
