package NACodingQuestions;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int num = 371;
		int temp=num;
		int sum = 0, rem;
		
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		if(sum==temp)
			System.out.println("It is an armstrong number ");
		else
			System.out.println("Not an armstrong number ");

	}
}
