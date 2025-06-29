package com.pratice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseCharsInSentence {

	public static void main(String[] args) {
		String sentence = "Java is powerful";
		String result = Arrays.stream(sentence.trim().split("\\s"))
				.map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println("Reversed each word: " + result);

	}

}
