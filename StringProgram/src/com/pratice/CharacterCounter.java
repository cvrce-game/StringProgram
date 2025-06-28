package com.pratice;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounter {

	public static void main(String[] args) {
		String input = "My name is papun";

		Map<Character, Long> ops = input.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(ops);
	}

}
