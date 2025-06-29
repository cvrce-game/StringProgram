package com.pratice;

public class AlphabetCheck {

	public static void main(String[] args) {
		String input = "HelloWorld";

		boolean op = input.chars().allMatch(Character::isLetter);

		System.out.println(op);
	}

}
