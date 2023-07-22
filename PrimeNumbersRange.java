package NACodingQuestions;

import java.util.Scanner;

public class PrimeNumbersRange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit : ");
		int l1 = sc.nextInt();
		System.out.println("Enter the Upper limit : ");
		int l2 = sc.nextInt();
		int count;

		for (int i = l1; i <= l2; i++) {
			count = 0;
			for (int j = 1; j <= l2; j++) {
				if (i % j == 0)
					count++;

			}
			if (count == 2)

				System.out.print(i + " ");
		}

	}

}
