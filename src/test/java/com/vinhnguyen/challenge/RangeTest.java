package com.vinhnguyen.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RangeTest {
	
	@Test
	public void numbers() {
		Range validAgesForHighSchool = Range.of(16, 18);
		assertEquals(validAgesForHighSchool.contains(5), false); // false
		assertEquals(validAgesForHighSchool.contains(17), true); // true
		
		//test exception
		try {
			Range.of(20, 18);
	        fail();
	    } 
	    catch (Exception e) {
	        final String expected = "lowerbound must be less than upperbound";
	        assertEquals( expected, e.getMessage());
	    }   
	}
}
