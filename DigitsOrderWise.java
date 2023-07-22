package NACodingQuestions;

import java.util.Arrays;

public class DigitsOrderWise {

	public static void main(String[] args) {

		long l = 28156437;
		String s = Long.toString(l);
		String[] arr = s.split("");
		String temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) < 0 && i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
