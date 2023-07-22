package NACodingQuestions;

public class ArmStrongRange {
	public static int noOfdigits(int x) {
		int count = 0;
		while (x > 0) {
			count++;
			x = x / 10;
		}
		return count;

	}

	public static boolean isArmstrong(int x) {

		int x1 = x;

		int noOfDigits = noOfdigits(x);

		double totalSum = 0;

		while (x > 0) {
			double rem = x % 10;
			totalSum += Math.pow(rem, noOfDigits);
			x = x / 10;
		}
		if (x1 == totalSum)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {
		
		int x = 100;
		int y = 500;
		for (int i = x; i <= y; i++) {
			if (isArmstrong(i))
				System.out.println(i);
		}

	}

}
