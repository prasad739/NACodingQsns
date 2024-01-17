package com.streamquestions;

public class ReversalAString {

	public static void main(String[] args) {

		String str = "Laxmi Prasad";

		String s = str.chars().mapToObj(ch -> (char) ch).map(st -> st + "").reduce((s1, s2) -> s2 + s1).get();

		System.out.println(s);

	}

}
