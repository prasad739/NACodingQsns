package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithNumber {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(11, 31, 21, 88, 15));

		List<String> collect = list.stream().map(i -> i + "").filter(str -> str.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect);

	}

}
