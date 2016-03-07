package com.nokia.romannumerals;

/**
 * Created by tajthy on 2016.03.07..
 */
public class RomanNumeralsConverter {
	public String convert(int arabic) {
		if (arabic < 1 || arabic > 3000) {
			throw new IllegalArgumentException("Input must be between 1 and 3000.");
		}

		return convertRecursive(arabic);

	}

	private String convertRecursive(int arabic) {
		if (arabic >= 1000) {
			return "M" + convertRecursive(arabic - 1000);
		}
		if (arabic % 500 >= 400) {
			return "C" + convertRecursive(arabic + 100);
		}
		if (arabic >= 500) {
			return "D" + convertRecursive(arabic - 500);
		}
		if (arabic >= 100) {
			return "C" + convertRecursive(arabic - 100);
		}
		if (arabic % 50 >= 40) {
			return "X" + convertRecursive(arabic + 10);
		}
		if (arabic >= 50) {
			return "L" + convertRecursive(arabic - 50);
		}
		if (arabic >= 10) {
			return "X" + convertRecursive(arabic - 10);
		}
		if (arabic % 5 >= 4) {
			return "I" + convertRecursive(arabic + 1);
		}
		if (arabic >= 5) {
			return "V" + convertRecursive(arabic - 5);
		}
		if (arabic >= 1) {
			return "I" + convertRecursive(arabic - 1);
		}
		return "";
	}
}
