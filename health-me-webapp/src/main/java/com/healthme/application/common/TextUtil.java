package com.healthme.application.common;

public class TextUtil {

	public static boolean isEmpty(String str) {
		return str == null || str == "" ? true : false;
	}

	public static boolean isNumeric(String str) {
		String regex = "\\d+";
		return str.matches(regex);
	}

	public static boolean isAlphaNumeric(String str) {
		String regex = "^[a-zA-Z0-9]*$";
		return str.matches(regex);
	}
}
