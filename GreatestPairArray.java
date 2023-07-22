package NACodingQuestions;

public class GreatestPairArray {

	public static void main(String[] args) {

		int[] arr = { 1, 23, 44, 22, 1, 78, 90, 52, 19 };

		int sum = Integer.MIN_VALUE;
		int a = 0;
		int maxIndex1 = 0;
		int maxIndex2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			a = arr[i] + arr[i + 1];
			if (a > sum) {
				sum = a;
				maxIndex1 = i;
				maxIndex2 = i + 1;
			}

		}
		System.out.print(arr[maxIndex1] + " " + arr[maxIndex2] + " = " + sum);

	}

}
