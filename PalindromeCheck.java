package NACodingQuestions;

public class PalindromeCheck {

	public static void main(String[] args) {

		String str = "madam";
		String str2 = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str2.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("Second string is same after reversal");
		else
			System.out.println("Not same");

	}

}
