package NACodingQuestions;

public class EvenOddCountArray {

	public static void main(String[] args) {

		int[] arr = { 12, 3, 9, 56, 45, 22 };
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenCount++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				oddCount++;
		}
		System.out.println("Total number of even elements : " + evenCount);
		System.out.println("Total number of odd elements : " + oddCount);

	}

}
