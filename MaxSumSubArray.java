package com.neosoft;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String[] args) {

		int[] arr = { 100, 200, 300, 400, 500 };
		int max = 0;
		int n = arr.length;
		int k = 3;

		for (int i = 0; i < k; i++) {
			max += arr[i];
		}
		for (int j = k; j < n; j++) {

			max += arr[j] - arr[j - k];

		}

		System.out.println("maximum sum of sub array::" + max);
	}

}
