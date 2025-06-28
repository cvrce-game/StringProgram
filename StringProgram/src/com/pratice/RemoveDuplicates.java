package com.pratice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "programming";

		Set<Character> seen = new HashSet<>();
		StringBuilder Ops = new StringBuilder();
		input.chars().forEach(c -> {
			if (seen.add((char) c)) {
				Ops.append((char) c);
			}
		});
		System.out.println(Ops);
	}

}
