package com.pratice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String input = "programming";

		Map<Character, Long> freq = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		freq.entrySet().stream().filter(ent -> ent.getValue() > 1).forEach(ent -> {
			System.out.println(ent.getKey());
		});
	}

}
