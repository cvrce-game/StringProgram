package com.pratice;

public class CheckStringContainDigit {

	public static void main(String[] args) {
		String input = "1234";

		boolean op = input.chars().allMatch(c -> Character.isDigit(c));
		System.out.println(op);
	}

}
