package NACodingQuestions;

public class PowerWithoutUsingInbuilt {

	public static void main(String[] args) {

		int num = 3;
		int x = 5;
		double pow = 1;

		if (x > 0) {
			for (int i = 1; i <= x; i++) {
				pow = pow * num;
			}
		} else {
			x = 0 - x;
			long pow2 = 1;
			for (int i = 1; i <= x; i++) {

				pow2 = pow2 * num;
			}
			pow = (double) 1 / pow2;
		}
		System.out.println(num + " power " + x + " is " + pow);

	}
}
