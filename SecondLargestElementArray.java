package NACodingQuestions;

public class SecondLargestElementArray {

	public static void main(String[] args) {

		int[] arr = { 12, 13, 44, 67, 90 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		int secondMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > secondMax && arr[i] != max)
				secondMax = arr[i];
		}
		System.out.println("The second Largest element in the given array is : " + secondMax);

	}

}
