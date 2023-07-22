package NACodingQuestions;

public class PalindromeCheckString {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (rev.equals(str))
			System.out.println("It is a palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
