package NACodingQuestions;

public class EvenOddSum {

	public static void main(String[] args) {

		int[] arr = { 12, 3, 9, 56, 45, 22 };
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenSum = evenSum + arr[i];
		}
		System.out.println("Even Elements Sum : " + evenSum);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				oddSum = oddSum + arr[i];
		}
		System.out.println("The odd elements sum : " + oddSum);

	}

}
