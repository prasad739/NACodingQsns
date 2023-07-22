package NACodingQuestions;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = { 12, 34, 56, 8, 1, 77, 66 };
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j] && i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
