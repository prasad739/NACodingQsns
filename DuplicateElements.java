package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 33, 45, 32, 76,45,45));

		Set<Integer> set = new HashSet<Integer>();

		List<Integer> collect = list.stream().filter(i -> !set.add(i)).distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

}
