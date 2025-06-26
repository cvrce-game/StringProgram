package com.pratice;

public class ReverseString {

	public static void main(String[] args) {
		String originalString ="Java Program";
		StringBuilder convertedStringBuilder= new StringBuilder(originalString);
		
		// Reverse the string by swapping characters from both ends
		for(int i=0;i<convertedStringBuilder.length()/2;i++) {
			char temp = convertedStringBuilder.charAt(i);
			int oppositeIndex = convertedStringBuilder.length() - 1 - i;
			convertedStringBuilder.setCharAt(i, convertedStringBuilder.charAt(oppositeIndex));
			convertedStringBuilder.setCharAt(oppositeIndex, temp);
		}
		
		System.out.println(String.format("Original String: %s", originalString));
		System.out.println(String.format("Reversed String: %s", convertedStringBuilder.toString()));
	}
}
