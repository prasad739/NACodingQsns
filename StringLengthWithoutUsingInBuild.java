package NACodingQuestions;

public class StringLengthWithoutUsingInBuild {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str = "prasad";
		char[] ch = str.toCharArray();
		int count=0;
		for(Character c :ch) {
			count++;
		}
		System.out.println(count);

	}

}
