package com.neosoft;

import java.util.ArrayList;
import java.util.List;

public class LeaderArray {

	public static List<Integer> leadingNumber(int[] a, int n) {
		List<Integer> list = new ArrayList<>();
		list.add(a[n - 1]);

		int lead = a[n - 1];

		for (int i = n - 2; i >= 0; i--) {

			if (a[i] > lead) {

				list.add(0, a[i]);
				lead = a[i];
			}
		}
		return list;

	}

	public static void main(String[] args) {

		int[] a = {16,17,4,3,5,2 };

		System.out.println(leadingNumber(a, a.length));

	}

}
