package NACodingQuestions;

public class NumberOfDigits {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int num = 965286831;

		// Using Inbuit Method
		String s = Integer.toString(num);
		System.out.println(s.length());

		int rem, count = 0;
		while (num > 0) {
			rem = num % 10;
			count++;
			num = num / 10;

		}
		System.out.println("Total number of digits in the given number are : " + count);

	}

}
