package NACodingQuestions;

import java.util.Arrays;
import java.util.Random;

public class LargestSmallestElementRandom {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int min = 10, max = 100;
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			arr[i] = rand.nextInt(max - min + 1) + min;
		}
		System.out.println(Arrays.toString(arr));

		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large)
				large = arr[i];
		}
		System.out.println("The largest element in the array is : " + large);

		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < small)
				small = arr[i];
		}
		System.out.println("The smallest element in the array is : " + small);

	}

}
