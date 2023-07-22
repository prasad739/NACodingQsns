package NACodingQuestions;

import java.util.Arrays;

public class MergingTwoArraysInToOne {

	public static void main(String[] args) {

		int[] arr = { 1, 34, 55, 63, 9, 756, 6 };
		int[] arr2 = { 5, 77, 53, 90, 5 };
		int[] arr3 = new int[arr.length + arr2.length];

		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		int index = arr.length;
		for (int j = 0; j < arr2.length; j++) {
			arr3[index] = arr2[j];
			index++;
		}
		System.out.println(Arrays.toString(arr3));

	}

}
