package com.nokia.romannumerals;

import org.junit.Test;

/**
 * Created by tajthy on 2016.03.07..
 */
public class RomanNumeralsConverterFailuresTest {

	private final RomanNumeralsConverter rn = new RomanNumeralsConverter();

	@Test(expected = IllegalArgumentException.class)
	public void testZero() throws Exception {
		rn.convert(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvert3001() throws Exception {
		rn.convert(3001);
	}

}
