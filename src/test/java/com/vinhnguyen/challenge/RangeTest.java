package com.vinhnguyen.challenge;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class RangeTest {
	
	@Test
	public void usingComparable() {
		Range text = Range.open("abc", "xyz");
		assertEquals(text.contains("abc"), false);
		assertEquals(text.contains("def"), true);
		
		Range decimals = Range.open(new BigDecimal("1.123"), new BigDecimal("1.23456789"));
		assertEquals(decimals.contains(new BigDecimal("1.133")), true);
		assertEquals(decimals.contains(new BigDecimal("1.123")), false);
		
		Range dates = Range.closed(LocalDate.of(2022, Month.SEPTEMBER, 01), LocalDate.of(2022, Month.SEPTEMBER, 30));
		assertEquals(dates.contains(LocalDate.of(2022, Month.SEPTEMBER, 20)), true);
		assertEquals(dates.contains(LocalDate.of(2022, Month.SEPTEMBER, 01)), true);
		assertEquals(dates.contains(LocalDate.of(2022, Month.OCTOBER, 01)), false);
		
		Range longs = Range.openClosed(Long.valueOf("1234567"), Long.valueOf("3456789"));
		assertEquals(longs.contains(Long.valueOf("2345678")), true);
		assertEquals(longs.contains(Long.valueOf("12345679")), false);
		
		Range doubles = Range.closedOpen(Double.valueOf("5.7"), Double.valueOf("6.0"));
		assertEquals(doubles.contains(Double.valueOf("5.7")), true);
		assertEquals(doubles.contains(Double.valueOf("6.0")), false);
	}
}
