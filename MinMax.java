package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 44, 65, 78, 99, 7, 12));

		Integer min = list.stream().sorted().distinct().findFirst().get();

		System.out.println("Minimum Element in the list is : " + min);

		Integer max = list.stream().sorted(Collections.reverseOrder()).findFirst().get();

		System.out.println("Maximum Element in the list is : " + max);

	}

}
