package com.pratice;

public class VowelConsonantCounter {
	public static void main(String[] args) {

		String input = "Hello World";
		long vowelsCount = input.chars().map(Character::toLowerCase).filter(ch -> "aeiou".indexOf(ch) != -1).count();

		long consonantCount = input.chars().map(Character::toLowerCase).filter(ch -> "aeiou".indexOf(ch) == -1).count();

		System.out.println("No of vowels are: " + vowelsCount);

		System.out.println("No of consonants are: " + consonantCount);

	}
}
