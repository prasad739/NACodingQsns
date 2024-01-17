package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 44, 65, 78, 99, 7, 12));

		list.stream().sorted(Collections.reverseOrder()).distinct().forEach(System.out::println);

	}

}
