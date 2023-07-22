package NACodingQuestions;

import java.util.Arrays;

public class lettersAscendingString {

	public static void main(String[] args) {

		String str = "prasad";

		 //Using Inbuit method
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));

		// Using Normal Approach
		String[] arr = str.split("");
		String temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) < 0 && i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
