package com.vinhnguyen.challenge;

public class Range {
	private int lowerbound;
	private int upperbound;
		
	private Range(int lowerbound, int upperbound) {
		super();
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
	}

	public static Range of(int lowbound, int uppbound) {
		//validate
		if (lowbound > uppbound) {
            throw new IllegalArgumentException("lowerbound must be less than upperbound");
        }
		
		//create new object
		return new Range(lowbound, uppbound);
	}
	
	public boolean contains(int number) {
 		return (number >= lowerbound && number <= upperbound);
	}
}
