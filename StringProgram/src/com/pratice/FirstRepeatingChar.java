package com.pratice;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		String input = "swiss";

		Set<Character> seen = new HashSet<>();

		for (char c : input.toCharArray()) {
			if (!seen.add(c)) {
				System.out.println("First repeating char in " + input + " is: " + c);
				return;
			}
		}

		System.out.println("No repeating character found.");
	}

}
