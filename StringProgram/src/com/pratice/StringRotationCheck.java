package com.pratice;

public class StringRotationCheck {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "cdab";

		String contacts1 = new String(s1 + s1);
		
		if(contacts1.contains(s2)) {
			System.out.println(s1 +" and "+ s2 +" are rotaional");
		}
	}

}
