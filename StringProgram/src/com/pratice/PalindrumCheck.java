package com.pratice;

import java.util.Arrays;

public class PalindrumCheck {

	public static void main(String[] args) {

		String input = "Madam";

		for (int i = 0; i < input.length() / 2; i++) {
			char startChar = Character.toLowerCase(input.charAt(i));
			char endChar = Character.toLowerCase(input.charAt(input.length() - 1 - i));

			if (startChar != endChar) {
				System.out.println(input + " is Not a Palindrome");
				return;
			}
		}
		System.out.println(input + " is Not a Palindrome");
	}

}
