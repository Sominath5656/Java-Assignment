package com.neosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {

	public static List<Integer> compress(List<Integer> input) {
		List<Integer> list = new ArrayList<>();
		int freq = 0;
		int val = 0;

		for (int i = 0; i < input.size(); i += 2) {
			freq = input.get(i);
			val = input.get(i + 1);

			for (int j = 0; j < freq; j++) {
				list.add(val);
			}
		}

		return list;
	}

	public static void main(String[] args) {

		List<Integer> input = Arrays.asList(1, 2, 3, 4);

		List<Integer> output = compress(input);

		System.out.println(output);

	}
}
