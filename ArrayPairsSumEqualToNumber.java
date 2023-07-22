package NACodingQuestions;

public class ArrayPairsSumEqualToNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 23, 45, 66, 2, 20, 4, 19, 5 };
		int num = 24;
		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i] + arr[i + 1];
			if (sum == num)
				System.out.println(arr[i] + " " + arr[i + 1]);
		}

	}

}
