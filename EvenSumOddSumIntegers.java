package NACodingQuestions;

import java.util.Scanner;

public class EvenSumOddSumIntegers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int range;
		int evenSum = 0, oddSum = 0;
		for (int i = 1; i <= num; i++) {
			range = sc.nextInt();
			if (range % 2 == 0) {
				evenSum = evenSum + range;
			} else if (range % 2 != 0)
				oddSum = oddSum + range;
		}
		System.out.println(oddSum);
		System.out.println(evenSum);

	}

}
