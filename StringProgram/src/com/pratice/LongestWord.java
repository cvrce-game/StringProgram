package com.pratice;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestWord {

	public static void main(String[] args) {
		String sentence = "Java is a powerful programming language";

//		String op = Arrays.stream(sentence.trim().split("\\s"))
//				.max((w1, w2) -> Integer.compare(w1.length(), w2.length())).orElse("");
//		System.out.println(op);
		Optional<Entry<String, Integer>> op = Arrays.stream(sentence.trim().split("\\s"))
				.collect(Collectors.toMap(word -> word, word -> word.length())).entrySet().stream()
				.max(Map.Entry.comparingByValue());

		op.ifPresentOrElse(ent -> System.out.println(ent.getKey() + ": " + ent.getValue()),
				() -> System.out.println("Not Found"));
	}

}
