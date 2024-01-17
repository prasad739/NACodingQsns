package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12, 45, 66, 87));

		Optional<Integer> findFirst = list.stream().findFirst();
		System.out.println(findFirst);

	}

}
