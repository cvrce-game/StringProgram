package com.pratice;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckWithMap {

	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";

		Map<Character, Long> freq = new HashMap<>();

		str1.toLowerCase().chars().forEach(ch -> {
			freq.put((char) ch, freq.getOrDefault((char) ch, 0L) + 1);
		});

		str2.toLowerCase().chars().forEach(ch -> {
			freq.put((char) ch, freq.getOrDefault((char) ch, 0L) - 1);
		});
		boolean allMatch = freq.values().stream().allMatch(c -> c == 0);
		System.out.println(str1 + " and " + str2 + " are " + (allMatch ? "anagram" : "Not anagram"));
	}

}
