package com.vinhnguyen.challenge;

public class Range {
	private int lowerbound;
	private int upperbound;
	private String type;

	private Range(int lowerbound, int upperbound) {
		super();
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
	}

	public Range(int lowerbound, int upperbound, String type) {
		super();
		this.lowerbound = lowerbound;
		this.upperbound = upperbound;
		this.type = type;
	}

	/**
	 * of
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static Range of(int lowbound, int uppbound) {
		// validate
		if (lowbound > uppbound) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound);
	}

	/**
	 * contains
	 * 
	 * @param number
	 * @return
	 */
	public boolean contains(int number) {
		switch (this.type) {
		case "open":
			return (number > this.lowerbound && number < this.upperbound);
		case "closed":
			return (number >= this.lowerbound && number <= this.upperbound);
		case "openClosed":
			return (number > this.lowerbound && number <= this.upperbound);
		case "closedOpen":
			return (number >= this.lowerbound && number < this.upperbound);
		default:
			throw new IllegalArgumentException("Failed!");
		}
	}

	/**
	 * open
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static Range open(int lowbound, int uppbound) {
		// validate
		if (lowbound > uppbound) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "open");
	}
	
	/**
	 * closed
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static Range closed(int lowbound, int uppbound) {
		// validate
		if (lowbound > uppbound) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "closed");
	}
	
	/**
	 * openClosed
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static Range openClosed(int lowbound, int uppbound) {
		// validate
		if (lowbound > uppbound) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "openClosed");
	}
	
	/**
	 * closedOpen
	 * 
	 * @param lowbound
	 * @param uppbound
	 * @return
	 */
	public static Range closedOpen(int lowbound, int uppbound) {
		// validate
		if (lowbound > uppbound) {
			throw new IllegalArgumentException("lowerbound must be less than upperbound");
		}

		// create new object
		return new Range(lowbound, uppbound, "closedOpen");
	}
}
