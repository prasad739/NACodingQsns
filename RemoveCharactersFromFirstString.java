package NACodingQuestions;

public class RemoveCharactersFromFirstString {

	public static void main(String[] args) {

		String str = "prasad";
		String str2 = "pra";

		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length()-1; i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (sb.charAt(i) == str.charAt(j)) {
					sb.deleteCharAt(i);
				
				}
			}
		}
		System.out.println(sb);

	}

}
