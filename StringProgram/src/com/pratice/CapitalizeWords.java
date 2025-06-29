package com.pratice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWords {

	public static void main(String[] args) {
		String sentence = "java is powerful";

		String op = Arrays.stream(sentence.trim().split("\\s+"))
				.map(word -> word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1))
				.collect(Collectors.joining(" "));
		System.out.println(op);
	}

}
