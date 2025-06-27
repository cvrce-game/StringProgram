package com.pratice;


public class PalindrumCheck {
	public static void main(String[] args) {

		String input = "1221";
		String lowerInput = input.toLowerCase();

		for (int i = 0; i < lowerInput.length() / 2; i++) {
			char startChar = lowerInput.charAt(i);
			char endChar = lowerInput.charAt(lowerInput.length() - 1 - i);

			if (startChar != endChar) {
				 System.out.println(input + " is not a Palindrome");
				return;
			}
		}
		System.out.println(input + " is a Palindrome");
	}

}
