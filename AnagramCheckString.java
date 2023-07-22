package NACodingQuestions;

import java.util.Arrays;

public class AnagramCheckString {

	public static void main(String[] args) {

		String str1 = "heart";
		String str2 = "earth";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
		
		String r1 = str1.chars().mapToObj(c->(char)c).map(st->st+" ").sorted().reduce("",(s1,s2)->s1+s2);
		String r2 = str2.chars().mapToObj(c->(char)c).map(st->st+" ").sorted().reduce("",(s1,s2)->s1+s2);
		System.out.println(r1.equals(r2));
		

		
	}
}
