package com.pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWords {

	public static void main(String[] args) {
		String sentence = "Java is powerful";

		String op = Arrays.stream(sentence.trim().split("\\s"))
				.collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
					Collections.reverse(lst);
					return String.join(" ", lst);
				}));

		System.out.println("Reverse of '" + sentence + "' is : " + op);

	}

}
