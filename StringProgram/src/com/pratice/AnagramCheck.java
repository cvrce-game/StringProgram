package com.pratice;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";
		boolean ops = false;

		char[] ch1 = str1.replace("\\s", "").toLowerCase().toCharArray();
		char[] ch2 = str2.replace("\\s", "").toLowerCase().toCharArray();

		if (ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			ops = Arrays.equals(ch1, ch2);
		}

		System.out.println(str1 + " and " + str2 + " are " + (ops ? "anagram" : "Not anagram"));
	}
}
