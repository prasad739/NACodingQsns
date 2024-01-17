package com.streamquestions;

public class ChangeCase {

	public static void main(String[] args) {

		String str = "GVP College Of Engineering";

		// without using the inbuilt methods
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			} else {
				ch = ' ';
			}

			System.out.print(ch);

		}

		// With using inbuilt method
		char ch = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				ch = Character.toLowerCase(str.charAt(i));
			} else {

				// Character.isLowerCase(str.charAt(i)))
				ch = Character.toUpperCase(str.charAt(i));
			}
			System.out.print(ch);

		}

		// using java 8
		String reversal = str.chars().mapToObj(c -> (char) c)
				.map(c1 -> Character.isUpperCase(c1) ? Character.toLowerCase(c1) : Character.toUpperCase(c1))
				.map(st -> st + "").reduce((s1, s2) -> s1 + s2).get();

		System.out.println(reversal);

	}

}
