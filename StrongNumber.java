package NACodingQuestions;

public class StrongNumber {

	public static void main(String[] args) {

		int num = 145;
		int temp = num;
		int rem, sum = 0;
		int factSum;

		while (num > 0) {
			rem = num % 10;
			factSum = 1;
			for (int i = 1; i <= rem; i++) {
				factSum = factSum * i;
			}
			sum = sum + factSum;
			num = num / 10;

		}
		if (temp == sum)
			System.out.println("It is a strong number  ");
		else
			System.out.println("Not a strong number  ");

	}

}
