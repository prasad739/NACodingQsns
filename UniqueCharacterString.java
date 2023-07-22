package NACodingQuestions;

public class UniqueCharacterString {

	public static void main(String[] args) {

		String str = "prasad";
		
		// Using Normal Approach
		char[] ch = str.toCharArray();
		int count;

		for (int i = 0; i < ch.length; i++) {
			count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j] && i != j) {
					count++;
					ch[j] = ' ';
				}
			}
			if (count == 0 && ch[i] != ' ') {
				System.out.print(ch[i] + " ");
			}
		}
		System.out.println();

		// using java8 Approach
		str.chars().mapToObj(c -> (char) c).map(s -> s + "").filter(st -> str.indexOf(st) == str.lastIndexOf(st))
				.forEach(System.out::println);

	}

}
