package NACodingQuestions;

public class EvenOddNumbersArray {

	public static void main(String[] args) {
		int[] arr = { 12, 3, 9, 56, 45, 22 };

		System.out.println("The even numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");

		}

		System.out.println("The odd numbers are : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}
	}
}
