package com.vinhnguyen.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RangeTest {
	
	@Test
	public void typeOfRange() {
		Range open = Range.open(5, 7);
		assertEquals(open.contains(5), false);
		
		Range closed = Range.closed(5, 7);
		assertEquals(closed.contains(5), true);
		
		Range openClosed = Range.openClosed(5, 7);
		assertEquals(openClosed.contains(5), false);
		assertEquals(openClosed.contains(7), true);
		
		Range closedOpen = Range.closedOpen(5, 7);
		assertEquals(closedOpen.contains(5), true);
		assertEquals(closedOpen.contains(7), false);
	}
}
