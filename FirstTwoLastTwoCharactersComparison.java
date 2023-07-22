package NACodingQuestions;

public class FirstTwoLastTwoCharactersComparison {

	public static void main(String[] args) {

		String str = "java program vajka";

		if (str.charAt(0) == str.charAt(str.length() - 1) || str.charAt(0) == str.charAt(str.length() - 2)) {

			if (str.charAt(1) == str.charAt(str.length() - 1) || str.charAt(1) == str.charAt(str.length() - 2)) {
				System.out.println("same chars");
			} else {
				System.out.println("not same");
			}

		} else {
			System.out.println("not same");
		}
	}

}
