package com.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String input = "swiss";

		Map<Character, Long> freq = new HashMap<>();

		input.chars().forEach(c -> {
			freq.put((char) c, freq.getOrDefault((char) c, 0L) + 1);
		});

		Optional<Entry<Character, Long>> ops = freq.entrySet().stream().filter(ent -> ent.getValue() == 1).findFirst();

		ops.ifPresent(c -> System.out.println(c.getKey()));
	}

}
