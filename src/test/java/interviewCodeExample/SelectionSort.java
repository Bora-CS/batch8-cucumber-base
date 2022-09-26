package interviewCodeExample;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = { 23, 55, 22, 1, 33, 67 };
		sortArrayBySelectionSort(numbers);

	}

	public static void sortArrayBySelectionSort(int[] ary) {

		for (int i = 0; i < ary.length - 1; i++) {
			int min = ary[i];
			int index = i;
			for (int j = 0; j < ary.length - 1; j++) {
				if (ary[j] < min) {
					min = ary[j];
					index = j;
				}
			}
			if (i != index) {
				int temp = ary[i];
				ary[i] = min;
				ary[index] = temp;
			}
		}
		System.out.println("+ i + " + Arrays.toString(ary));
	}

}
