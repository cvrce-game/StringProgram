package com.pratice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		String input = "successes";

		Map<Character, Long> ops = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		Optional<Entry<Character, Long>> finalops = ops.entrySet().stream().max(Map.Entry.comparingByValue());

		finalops.ifPresentOrElse(
				ent -> System.out.println(
						"Most frequent character: '" + ent.getKey() + "' occurred " + ent.getValue() + " times."),
				() -> System.out.println("Not found"));
	}

}
