package NACodingQuestions;

public class PrimeFactors {

	public static void main(String[] args) {

		int num = 100;
		int count;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				int temp = i;
				count = 0;
				for (int j = 1; j <= temp; j++) {
					if (temp % j == 0)
						count++;

				}
				if (count == 2)
					System.out.print(i + " ");
			}

		}

	}

}
