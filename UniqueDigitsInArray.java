package NACodingQuestions;

public class UniqueDigitsInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 13, 67, 12, 13, 89, 0 };
		int count;

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j && i != j)
					count++;

			}
			if (count == 0)
				System.out.print(arr[i] + " ");

		}

	}

}
