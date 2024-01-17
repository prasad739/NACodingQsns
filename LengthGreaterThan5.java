package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGreaterThan5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Laxmi Prasad", "Shweta", "Lochana", "Madhuri", "Ram"));

		List<String> collect = list.stream().filter(str -> str.length() > 5).collect(Collectors.toList());

		System.out.println(collect);
	}

}
