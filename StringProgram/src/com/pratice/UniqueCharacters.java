package com.pratice;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		String input = "abcdef";

		Set<Character> seen = new HashSet<>();

		input.chars().forEach(c -> {
			seen.add((char) c);
		});

		if (seen.size() == input.length()) {
			System.out.println("All charecter are unique");
		} else {
			System.out.println("All charecter are not unique");
		}
	}

}
