package com.neosoft;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "ab?/Ba";
		String string = s.replaceAll("[^a-zA-z0-9]", "");
	
		StringBuffer sb = new StringBuffer();
		sb.append(string);
		sb.reverse();	

		if (sb.toString().equalsIgnoreCase(string)) {
			System.out.println("String is palindrome::YES");
		} else {
			System.out.println("String is palindrome::NO");
		}

	}
}
