package NACodingQuestions;

public class CaptilizeFirstLastCharacterWord {

	public static void main(String[] args) {
		String str = "heroes are not born they arise";
		String[] s = str.split(" ");

		for (String word : s) {
			if (word.length() > 1) {
				char c1 = Character.toUpperCase(word.charAt(0));
				char c2 = Character.toUpperCase(word.charAt(word.length() - 1));

				String str2 = c1 + word.substring(1, word.length() - 1) + c2;
				System.out.print(str2 + " ");
			}
		}
	}
}
