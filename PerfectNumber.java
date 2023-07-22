package NACodingQuestions;

public class PerfectNumber {

	public static void main(String[] args) {

		int num = 6;
		int temp = num;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (temp == sum)
			System.out.println("It is a perfect number ");
		else
			System.out.println("Not a perfect number ");

	}

}
