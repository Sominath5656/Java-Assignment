package com.neosoft;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

	public static int isIsomorphic(String s1, String s2) {

		if (s1 == null || s2 == null || s1.length() != s2.length()) {

			return 0;
		}

		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {

			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);

			if (map.containsKey(ch1)) {
				if (map.get(ch1) != ch2) {
					return 0;
				}
			} 
			else {
				if (map.containsValue(ch2)) {
					return 0;
				}
				map.put(ch1, ch2);
			//	System.out.println("map object::" + map);
			}
		}
		return 1;
	}

	public static void main(String args[]) {
		System.out.println(" first "+ isIsomorphic("xxy", "aap"));
		System.out.println(" second "+ isIsomorphic("cat", "boo"));
		System.out.println(" fourth "+ isIsomorphic("title", "paper"));
	}

}
