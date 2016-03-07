package com.nokia.romannumerals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class RomanNumeralsConverterTest {

	private final RomanNumeralsConverter rn = new RomanNumeralsConverter();
	private final int arabic;
	private final String roman;

	public RomanNumeralsConverterTest(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]
			{
				{1, "I"},
				{2, "II"},
				{3, "III"},
				{4, "IV"},
				{5, "V"},
				{6, "VI"},
				{7, "VII"},
				{8, "VIII"},
				{9, "IX"},
				{10, "X"},
				{11, "XI"},
				{14, "XIV"},
				{15, "XV"},
				{19, "XIX"},
				{21, "XXI"},
				{38, "XXXVIII"},
				{39, "XXXIX"},
				{40, "XL"},
				{41, "XLI"},
				{50, "L"},
				{90, "XC"},
				{99, "XCIX"},
				{100, "C"},
				{149, "CXLIX"},
				{399, "CCCXCIX"},
				{400, "CD"},
				{500, "D"},
				{899, "DCCCXCIX"},
				{900, "CM"},
				{1999, "MCMXCIX"},
				{3000, "MMM"},
			});
	}

	@Test
	public void testConvert() throws Exception {
		assertConversion(arabic, roman);
	}


	private void assertConversion(int arabic, String roman) {
		assertThat(rn.convert(arabic), is(roman));
	}
}
