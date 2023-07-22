package NACodingQuestions;

public class SmallestConsecutiveSum {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 1, 77, 65, 12 };

		int smallestSum = arr[0] + arr[1] + arr[2];
		
		for (int i = 0; i < arr.length - 1; i++) {
			int sum = arr[i] + arr[i + 1];
			if (sum < smallestSum) {
				smallestSum = sum;

			}
		}
		System.out.println(smallestSum);

	}

}
