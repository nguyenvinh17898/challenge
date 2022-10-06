package com.vinhnguyen.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RangeTest {
	
	@Test
	public void numbers() {
		Range validAgesForHighSchool = Range.of(16, 18);
		assertEquals(validAgesForHighSchool.contains(5), false); // false
		assertEquals(validAgesForHighSchool.contains(17), true); // true
	}
}
